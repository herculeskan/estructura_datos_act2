// Ejemplo de Ordenamiento rápido
let numeros = [9, 8, 7, 6, 5, 4, 3, 2, 1];
let numerosOrdenados = new Array(9).fill(0);
let pivote = numeros[0];
let contador = 0;

// Ordenar números
for (let i = 1; i < 9; i++) {
  if (numeros[i] < pivote) {
    numerosOrdenados[contador] = numeros[i];
    contador++;
  }
}
numerosOrdenados[contador] = pivote;
contador++;
for (let i = 1; i < 9; i++) {
  if (numeros[i] > pivote) {
    numerosOrdenados[contador] = numeros[i];
    contador++;
  }
}

// Mostrar números ordenados
console.log("Números ordenados:");
for (let i = 0; i < 9; i++) {
  process.stdout.write(numerosOrdenados[i] + " ");
}
console.log();
