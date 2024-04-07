// Ejemplo de distribución Sort
let numeros = [9, 8, 7, 6, 5, 4, 3, 2, 1];
let numerosOrdenados = new Array(9).fill(0);
let numerosOrdenados2 = new Array(9).fill(0);
let pivote = numeros[0];
let pivote2 = numeros[8];
let contadorPivote = 0;
let contadorPivote2 = 0;

// Ordenar números
for (let i = 0; i < 9; i++) {
  if (numeros[i] < pivote) {
    numerosOrdenados[contadorPivote] = numeros[i];
    contadorPivote++;
  }
  if (numeros[i] > pivote2) {
    numerosOrdenados2[contadorPivote2] = numeros[i];
    contadorPivote2++;
  }
}

// Mostrar números ordenados
console.log("Números ordenados:");
for (let i = 0; i < contadorPivote; i++) {
  process.stdout.write(numerosOrdenados[i] + " ");
}
for (let i = 0; i < contadorPivote2; i++) {
  process.stdout.write(numerosOrdenados2[i] + " ");
}
console.log();
