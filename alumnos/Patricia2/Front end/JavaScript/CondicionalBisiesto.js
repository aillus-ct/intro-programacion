function esBisiesto(anio) {
    console.log(`Verificando año: ${anio}`);
    console.log(`Cálculo: ${anio} % 4 = ${anio % 4}`);
    if ((anio % 4 === 0)) {
        return true;
    } else {
        return false;
    }
}
console.log(esBisiesto(2020)); 