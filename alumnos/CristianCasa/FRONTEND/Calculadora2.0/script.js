// script.js

function press(key) {
  document.getElementById("display").value += key;
}

function clearDisplay() {
  document.getElementById("display").value = "";
}

function calculate() {
  try {
    document.getElementById("display").value = eval(document.getElementById("display").value);
  } catch (e) {
    document.getElementById("display").value = "Error";
  }
}