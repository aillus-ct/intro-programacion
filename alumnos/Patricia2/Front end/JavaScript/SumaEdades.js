const personas = [
    { nombre: "Guille", edad: 27, nacionalidad: "Uruguayo" },
    { nombre: "Ana", edad: 67, nacionalidad: "Argentina" },
    { nombre: "Pedro", edad: 13, nacionalidad: "Argentina" },
    { nombre: "Maria", edad: 9, nacionalidad: "Uruguaya" },
    { nombre: "Juan", edad: 30, nacionalidad: "Argentina" },
    { nombre: "Luis", edad: 89, nacionalidad: "Argentina" }
];

let sumaEdades = 0;

/*for (let i = 0; i < personas.length; i++) {
    if (personas[i].edad >= 18) {
        sumaEdades += personas[i].edad;
    }
}*/
// for of
/*for (const persona of personas){
    if (persona.edad >= 18){
        sumaEdades += persona.edad;
    }
}*/
// for each
personas.forEach((persona) => {
    if (persona.edad >= 18) {
        sumaEdades += persona.edad;
    }
});

console.log("Suma de edades:", sumaEdades);