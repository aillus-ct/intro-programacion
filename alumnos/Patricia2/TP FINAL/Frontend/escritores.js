// Variable global para almacenar los escritores
let listaEscritores = [];

// ✅ FUNCIÓN PARA CARGAR ESCRITORES CON SPINNER
async function cargarEscritores() {
    // Mostrar spinner
    document.getElementById('loading-escritores').style.display = 'block';
    document.getElementById('contenedor-escritores').style.display = 'none';
    
    try {
        console.log('🔄 Cargando escritores desde la base de datos...');
        
        const response = await fetch('http://localhost:4567/escritores'); // espera la respuesta del servidor
        
        if (!response.ok) {
            throw new Error(`Error ${response.status}: ${response.statusText}`);
        }
        
        const data = await response.json(); // espera a que el cuerpo de la respuesta se convierta a JSON
        console.log('✅ Escritores cargados:', data);
        
        listaEscritores = data; // Guardar en la variable global y continua con los datos listos para mostrar
        
        // Ocultar spinner y mostrar contenido
        document.getElementById('loading-escritores').style.display = 'none';
        document.getElementById('contenedor-escritores').style.display = 'grid';
        
        // Mostrar cada escritor en la página
        data.forEach(escritor => {
            agregarTarjeta(escritor.id, escritor.nombre, escritor.pais, escritor.genero, escritor.descripcion, escritor.obras, escritor.urlImagen);
        });
        
    } catch (error) {
        console.error('❌ Error al cargar escritores:', error);
        
        // Ocultar spinner
        document.getElementById('loading-escritores').style.display = 'none';
        document.getElementById('contenedor-escritores').style.display = 'grid';
        
        // Mostrar error al usuario
        document.getElementById('contenedor-escritores').innerHTML = `
            <div style="grid-column: 1/-1; text-align: center; padding: 20px; background-color: #ffe6e6; border-radius: 10px;">
                <h3>❌ Error al cargar escritores</h3>
                <p>No se pudo conectar con la base de datos.</p>
                <p><strong>Error:</strong> ${error.message}</p>
                <button onclick="cargarEscritores()" style="background-color: #c70452; color: white; border: none; padding: 10px 20px; border-radius: 5px; cursor: pointer; margin-top: 10px;">
                    🔄 Intentar de nuevo
                </button>
            </div>
        `;
    }
}

// Cargar escritores cuando se carga la página
document.addEventListener('DOMContentLoaded', cargarEscritores);

function agregarTarjeta(id, nombre, pais, genero, descripcion, obras, urlImagen) {
    const tarjeta = document.createElement('div');
    tarjeta.className = 'tarjetaEscritor';
    
    // 📝 Función para extraer el apellido 
    function obtenerApellido(nombreCompleto) {
        const partes = nombreCompleto.trim().split(' ');
        
        // Lista de apellidos compuestos conocidos - agregar más si es necesario
        const apellidosCompuestos = ['García Márquez', 'Vargas Llosa', 'Allende Gossens', 'García Lorca'];
        
        // Verificar si contiene un apellido compuesto conocido
        const apellidoCompuesto = apellidosCompuestos.find(apellido => 
            nombreCompleto.includes(apellido)
        );
        
        if (apellidoCompuesto) {
            return apellidoCompuesto; // "Gabriel García Márquez" → "García Márquez"
        }
        
        // Lógica por defecto si no es apellido compuesto conocido
        if (partes.length === 1) {
            return nombreCompleto; // Solo una palabra
        } else if (partes.length === 2) {
            return partes[1]; // "Julio Cortázar" → "Cortázar"
        } else if (partes.length === 3) {
            return partes[2]; // "Jorge Luis Borges" → "Borges"
        } else {
            // Para 4+ palabras, tomar las últimas 2 por defecto
            return partes.slice(-2).join(' ');
        }
    }
    
    const apellido = obtenerApellido(nombre);
    
    tarjeta.innerHTML = `
        <img src="${urlImagen}" alt="${nombre}" onerror="this.src='https://via.placeholder.com/300x220?text=Sin+Imagen'" />
        <div class="contenido">
            <strong title="${nombre}">${apellido}</strong>
        </div>
    `;
    tarjeta.addEventListener('click', function() { 
        window.location.href = `detalleEscritor.html?id=${id}`;
    });
    document.getElementById('contenedor-escritores').appendChild(tarjeta);
}

// Formulario para agregar escritor + VALIDACIONES
document.getElementById('form-escritor').addEventListener('submit', async function(e) {
    e.preventDefault();
    
    // Obtener valores del formulario
    const nombre = document.getElementById('nombre-escritor').value.trim();
    const pais = document.getElementById('pais-escritor').value.trim();
    const genero = document.getElementById('genero-escritor').value.trim();
    const descripcion = document.getElementById('descripcion-escritor').value.trim();
    const obras = document.getElementById('obras-escritor').value.trim();
    const urlImagen = document.getElementById('urlImagen-escritor').value.trim();
    
    //  VALIDACIONES SIMPLES
    if (nombre === '') {
        alert('Por favor, ingresa el nombre del escritor');
        return;
    }
    
    if (pais === '') {
        alert('Por favor, ingresa el país del escritor');
        return;
    }
    
    if (genero === '') {
        alert('Por favor, ingresa el género literario');
        return;
    }
    
    if (descripcion === '') {
        alert('Por favor, ingresa una descripción');
        return;
    }
    
    if (obras === '') {
        alert('Por favor, ingresa las obras del escritor');
        return;
    }
    
    if (urlImagen === '') {
        alert('Por favor, ingresa la URL de la imagen');
        return;
    }
    
    // VALIDACIÓN 2: Verificar longitud mínima
    if (nombre.length < 2) {
        alert('El nombre debe tener al menos 2 caracteres');
        return;
    }
    
    if (descripcion.length < 10) {
        alert('La descripción debe tener al menos 10 caracteres');
        return;
    }
    
    // ✅ ENVIAR A LA API MySQL CON FETCH POST
    const nuevoEscritor = {
        nombre,
        pais,
        genero,
        descripcion,
        obras,
        urlImagen
    };
    
    console.log('📤 Enviando escritor al servidor:', nuevoEscritor);
    
    try {
        console.log('🌐 Haciendo fetch POST a: http://localhost:4567/escritores');
        
        const response = await fetch('http://localhost:4567/escritores', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(nuevoEscritor) // convierte el objeto JS a JSON
        });
        
        console.log('📥 Respuesta del servidor:', response.status, response.statusText);
        
        if (!response.ok) {
            const errorData = await response.json();
            console.error('❌ Error del servidor:', errorData);
            alert('Error: ' + errorData.error);
            return;
        }
        
        const escritorCreado = await response.json();
        console.log('✅ Escritor creado exitosamente:', escritorCreado);
        
        // Agregar a la lista local
        listaEscritores.push(escritorCreado);
        
        // Crear la tarjeta visual
        agregarTarjeta(escritorCreado.id, escritorCreado.nombre, escritorCreado.pais, escritorCreado.genero, escritorCreado.descripcion, escritorCreado.obras, escritorCreado.urlImagen);
        
        // Limpiar el formulario
        document.getElementById('form-escritor').reset();
        
        // Mensaje de confirmación
        alert('¡Escritor agregado correctamente a la base de datos!');
        
    } catch (error) {
        console.error('Error al agregar escritor:', error);
        alert('Error al conectar con el servidor: ' + error.message);
    }
});

// Filtro en el formulario de búsqueda
document.getElementById('criterio-busqueda').addEventListener('input', function(e) {
    const criterio = this.value.toLowerCase();
    document.getElementById('contenedor-escritores').innerHTML = ''; // Limpiar contenedor
    listaEscritores
        .filter(escritor => escritor.nombre.toLowerCase().includes(criterio))
        .forEach(escritor => {
            agregarTarjeta(escritor.id, escritor.nombre, escritor.pais, escritor.genero, escritor.descripcion, escritor.obras, escritor.urlImagen);
        });
});

