function calcularAreaRectangulo(base, altura) {
    return base * altura;
}

function calcularAreaCirculo(radio) {
    return Math.PI * radio * radio;
}

console.log(`Área del rectángulo: ${calcularAreaRectangulo(5, 10)}`);
console.log(`Área del círculo: ${calcularAreaCirculo(7)}`);