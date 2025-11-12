// Variable global para almacenar la información del escritor
let escritorActual = null;

async function cargarDetalleEscritor() {
    const urlParams = new URLSearchParams(window.location.search);
    const idEscritor = urlParams.get('id');
    
    // Mostrar loading
    document.getElementById('loading').style.display = 'block';
    document.getElementById('error-message').style.display = 'none';
    document.getElementById('escritor-detalle').style.display = 'none';
    
    if (!idEscritor) {
        mostrarError('No se proporcionó un ID de escritor válido.');
        return;
    }
    
    try {
        console.log(`🔍 Cargando escritor con ID: ${idEscritor}`);
        
        const response = await fetch(`http://localhost:4567/escritores/${idEscritor}`);
        
        if (!response.ok) {
            if (response.status === 404) {
                mostrarError('El escritor solicitado no fue encontrado.');
            } else {
                mostrarError(`Error del servidor: ${response.status}`);
            }
            return;
        }
        
        const escritor = await response.json();
        console.log('✅ Escritor cargado:', escritor);
        
        escritorActual = escritor;
        mostrarDetalleEscritor(escritor);
        
    } catch (error) {
        console.error('❌ Error al cargar el escritor:', error);
        mostrarError('Error de conexión. Asegúrate de que el servidor esté funcionando.');
    }
}

function mostrarDetalleEscritor(escritor) {
    // Ocultar loading y error
    document.getElementById('loading').style.display = 'none';
    document.getElementById('error-message').style.display = 'none';
    
    // Actualizar título de la página
    document.title = `${escritor.nombre} - Detalle del Escritor`;
    
    // Llenar la información
    document.getElementById('escritor-nombre').textContent = escritor.nombre;
    document.getElementById('escritor-pais').textContent = escritor.pais;
    document.getElementById('escritor-genero').textContent = escritor.genero;
    document.getElementById('escritor-descripcion').textContent = escritor.descripcion;
    
    // Configurar imagen
    const imgElemento = document.getElementById('escritor-imagen');
    imgElemento.src = escritor.urlImagen;
    imgElemento.alt = `Foto de ${escritor.nombre}`;
    imgElemento.onerror = function() {
        this.src = 'https://via.placeholder.com/300x350/E0D1ED/4B004C?text=Sin+Imagen';
    };
    
    // Llenar lista de obras
    const obrasLista = document.getElementById('escritor-obras');
    obrasLista.innerHTML = '';
    
    if (escritor.obras && escritor.obras.trim() !== '') {
        const obras = escritor.obras.split(',').map(obra => obra.trim());
        obras.forEach(obra => {
            if (obra) {
                const li = document.createElement('li');
                li.textContent = obra;
                obrasLista.appendChild(li);
            }
        });
    } else {
        const li = document.createElement('li');
        li.textContent = 'No hay obras registradas';
        li.style.fontStyle = 'italic';
        li.style.color = '#666';
        obrasLista.appendChild(li);
    }
    
    // Mostrar el contenido
    document.getElementById('escritor-detalle').style.display = 'block';
    
    // ✅ Configurar event listeners para los botones
    configurarEventListeners();
}

function mostrarError(mensaje) {
    document.getElementById('loading').style.display = 'none';
    document.getElementById('escritor-detalle').style.display = 'none';
    
    document.getElementById('error-text').textContent = mensaje;
    document.getElementById('error-message').style.display = 'block';
}

// ✅ CONFIGURAR EVENT LISTENERS PARA LOS BOTONES
function configurarEventListeners() {
    // Botón editar
    document.getElementById('btn-editar').addEventListener('click', function() {
        if (escritorActual) {
            editarEscritor();
        }
    });
    
    // Botón eliminar
    document.getElementById('btn-eliminar').addEventListener('click', async function() {
        if (!escritorActual) return;
        
        const confirmacion = confirm(`¿Estás seguro de que quieres eliminar a ${escritorActual.nombre}?\n\nEsta acción no se puede deshacer.`);
        
        if (confirmacion) {
            await eliminarEscritor();
        }
    });
}

// ✅ FUNCIÓN PARA EDITAR ESCRITOR
function editarEscritor() {
    // Crear formulario de edición dinámicamente
    const contenidoEscritor = document.querySelector('.escritor-contenido');
    
    // Ocultar el contenido actual
    document.querySelector('.descripcion-section').style.display = 'none';
    document.querySelector('.obras-section').style.display = 'none';
    document.querySelector('.acciones-section').style.display = 'none';
    
    // Crear formulario de edición
    const formEdicion = document.createElement('div');
    formEdicion.className = 'form-edicion';
    formEdicion.innerHTML = `
        <h2>✏️ Editar Escritor</h2>
        <form id="form-editar">
            <div class="campo-edicion">
                <label for="edit-nombre">Nombre:</label>
                <input type="text" id="edit-nombre" value="${escritorActual.nombre}" required>
            </div>
            <div class="campo-edicion">
                <label for="edit-pais">País:</label>
                <input type="text" id="edit-pais" value="${escritorActual.pais}" required>
            </div>
            <div class="campo-edicion">
                <label for="edit-genero">Género:</label>
                <input type="text" id="edit-genero" value="${escritorActual.genero}" required>
            </div>
            <div class="campo-edicion">
                <label for="edit-descripcion">Descripción:</label>
                <textarea id="edit-descripcion" required>${escritorActual.descripcion}</textarea>
            </div>
            <div class="campo-edicion">
                <label for="edit-obras">Obras:</label>
                <textarea id="edit-obras" required>${escritorActual.obras}</textarea>
            </div>
            <div class="campo-edicion">
                <label for="edit-url">URL de la imagen:</label>
                <input type="url" id="edit-url" value="${escritorActual.urlImagen}" required>
            </div>
            <div class="botones-edicion">
                <button type="submit" class="btn btn-guardar">💾 Guardar cambios</button>
                <button type="button" class="btn btn-cancelar" onclick="cancelarEdicion()">❌ Cancelar</button>
            </div>
        </form>
    `;
    
    contenidoEscritor.appendChild(formEdicion);
    
    // Configurar event listener para el formulario
    document.getElementById('form-editar').addEventListener('submit', async function(e) {
        e.preventDefault();
        await guardarCambios();
    });
}

// ✅ FUNCIÓN PARA GUARDAR CAMBIOS
async function guardarCambios() {
    const datosActualizados = {
        nombre: document.getElementById('edit-nombre').value.trim(),
        pais: document.getElementById('edit-pais').value.trim(),
        genero: document.getElementById('edit-genero').value.trim(),
        descripcion: document.getElementById('edit-descripcion').value.trim(),
        obras: document.getElementById('edit-obras').value.trim(),
        urlImagen: document.getElementById('edit-url').value.trim()
    };
    
    // Validaciones básicas
    if (!datosActualizados.nombre || !datosActualizados.pais || !datosActualizados.genero || 
        !datosActualizados.descripcion || !datosActualizados.obras || !datosActualizados.urlImagen) {
        alert('Todos los campos son obligatorios');
        return;
    }
    
    try {
        console.log(`🔄 Actualizando escritor ID ${escritorActual.id}:`, datosActualizados);
        
        const response = await fetch(`http://localhost:4567/escritores/${escritorActual.id}`, {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(datosActualizados)
        });
        
        if (!response.ok) {
            const errorData = await response.json();
            throw new Error(errorData.error || `Error ${response.status}`);
        }
        
        const escritorActualizado = await response.json();
        console.log('✅ Escritor actualizado exitosamente:', escritorActualizado);
        
        // Actualizar la variable global
        escritorActual = escritorActualizado;
        
        // Recargar la página para mostrar los cambios
        location.reload();
        
    } catch (error) {
        console.error('❌ Error al actualizar el escritor:', error);
        alert('Error al actualizar el escritor: ' + error.message);
    }
}

// ✅ FUNCIÓN PARA CANCELAR EDICIÓN
function cancelarEdicion() {
    // Remover el formulario de edición
    const formEdicion = document.querySelector('.form-edicion');
    if (formEdicion) {
        formEdicion.remove();
    }
    
    // Mostrar el contenido original
    document.querySelector('.descripcion-section').style.display = 'block';
    document.querySelector('.obras-section').style.display = 'block';
    document.querySelector('.acciones-section').style.display = 'flex';
}

// ✅ FUNCIÓN PARA ELIMINAR ESCRITOR
async function eliminarEscritor() {
    if (!escritorActual) return;
    
    try {
        console.log(`🗑️ Eliminando escritor: ${escritorActual.nombre}`);
        
        const response = await fetch(`http://localhost:4567/escritores/${escritorActual.id}`, {
            method: 'DELETE'
        });
        
        if (!response.ok) {
            throw new Error(`Error ${response.status}: ${response.statusText}`);
        }
        
        console.log('✅ Escritor eliminado exitosamente');
        
        alert(`${escritorActual.nombre} ha sido eliminado correctamente.`);
        
        // Redirigir a la página principal
        window.location.href = 'escritores.html';
        
    } catch (error) {
        console.error('❌ Error al eliminar el escritor:', error);
        alert('Error al eliminar el escritor. Por favor, inténtalo de nuevo.');
    }
}

// Cargar el detalle cuando se carga la página
document.addEventListener('DOMContentLoaded', cargarDetalleEscritor);
