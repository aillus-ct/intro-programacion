// URL ejemplo: https://misite.com/pagina.html?nombre=Juan&edad=25

// Obtener todos los parámetros
const parametros = new URLSearchParams(window.location.search);

// Obtener un parámetro específico
const nombre = parametros.get('nombre'); // "Juan"
const edad = parametros.get('edad'); // "25"

// Verificar si existe un parámetro
if (parametros.has('nombre')) {
    console.log('El parámetro nombre existe');
}

// Obtener todos los parámetros como objeto
const todosParametros = Object.fromEntries(parametros);
console.log(todosParametros); // {nombre: "Juan", edad: "25"}