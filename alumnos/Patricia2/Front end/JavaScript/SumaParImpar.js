let sumaPar = 0; 
let sumaImpar = 0; 

//const lista = [];
for (let i = 1; i <= 100; i++) {
    if (i % 2 === 0) {
        sumaPar += i;
    }else if (i % 2 !== 0) {
        sumaImpar += i;
    }
}
console.log("Suma de pares:", sumaPar);
console.log("Suma de impares:", sumaImpar);