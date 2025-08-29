let pantalla = document.getElementById("pantalla");

function agregarNumero(num) {
    pantalla.value += num;
}

function agregarOperador(op) {
    if (pantalla.value !== '' && !esOperador(pantalla.value.slice(-1))) {
    pantalla.value += op;
    }
}

function esOperador(caracter) {
    return ['+', '-', '*', '/'].includes(caracter);
}

function calcularResultado() {
    try {
    pantalla.value = eval(pantalla.value);
    } catch {
    pantalla.value = 'Error';
    }
}

function limpiarPantalla() {
    pantalla.value = '';
}
