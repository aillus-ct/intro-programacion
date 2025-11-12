const listadepersonajes = [
    {
        id: 1,
        nombre: "Superman",
        url: "https://www.elespectador.com/resizer/v2/MWZZGQ46URFQ7BVDDWVWGUR3XA.jpg?auth=4da341a5b4cc51a6d0bf73c4cc9d939d14c3c007a04e2f81dd36bd352dc7b5ca&width=920&height=613&smart=true&quality=60",
        descripcion: "El hombre de acero.",
        poderes: "Superfuerza, vuelo, visión de rayos X.",
        debilidades: "Kryptonita."
    },
    {
        id: 2,
        nombre: "Batman",
        url: "https://preview.redd.it/what-do-you-prefer-in-comics-batman-portrayed-in-a-more-v0-cfd0vq1jhcie1.jpg?width=320&crop=smart&auto=webp&s=e31aa7bd5080c19ccfe22a9acff45dbf9bf8d0c3",
        descripcion: "El caballero oscuro.",
        poderes: "Inteligencia, habilidades de combate.",
        debilidades: "Ninguna conocida."
    }
];
 function agregarTarjeta(id, nombre, url){
    const tarjeta = document.createElement('div');
    tarjeta.className = 'tarjetaSuperheroe';
    // Mostrar solo nombre e imagen al principio
    // Wrap non-image content in .contenido so the card can keep padding while image reaches edges
    tarjeta.innerHTML = `
        <img src="${url}" alt="${nombre}" />
        <div class="contenido">
            <strong>${nombre}</strong>
        </div>
    `;
    tarjeta.addEventListener('click', function() { 
        window.location.href = `detalle.html?id=${id}`;
    });
    document.querySelector('.contenedor-columnas').appendChild(tarjeta);
 }

 listadepersonajes.forEach(personaje => {
    agregarTarjeta(personaje.id, personaje.nombre, personaje.url);
 });


// Formulario de agregar superhéroe
document.getElementById('form-superheroe').addEventListener('submit', function(e) {
    e.preventDefault();
    const id = Math.max(listadepersonajes.map(p => p.id)) + 1;
    const nombre = document.getElementById('nombre-superheroe').value;
    const url = document.getElementById('url-superheroe').value;
    const descripcion = document.getElementById('descripcion-superheroe').value;
    const poderes = document.getElementById('poder-superheroe').value;
    const debilidades = document.getElementById('debilidad-superheroe').value;
    
    agregarTarjeta(id, nombre, url);
    listadepersonajes.push({id, nombre, url, descripcion, poderes, debilidades}); // agrega un elemento a la lista
    document.getElementById('form-superheroe').reset();
});

// Filtro en el formulario de búsqueda
document.getElementById('criterio-busqueda').addEventListener('input', function(e) {
    const criterio = this.value.toLowerCase();
    document.querySelector('.contenedor-columnas').innerHTML = ''; // Limpiar contenedor
    listadepersonajes
        .filter(personaje => personaje.nombre.toLowerCase().includes(criterio))
        .forEach(personaje => {
            agregarTarjeta(personaje.id, personaje.nombre, personaje.url);
        });
});
