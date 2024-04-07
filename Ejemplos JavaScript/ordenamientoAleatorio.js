// Ejemplo de ordenamiento aleatorio
let numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9];
let numerosAleatorios = new Array(9).fill(0);
let numerosOrdenados = new Array(9).fill(0);
let numeroAleatorio;
let contador = 0;
let existe = false;

// Generar números aleatorios
while (contador < 9) {
    numeroAleatorio = Math.floor(Math.random() * 9) + 1;
    for (let i = 0; i < 9; i++) {
        if (numerosAleatorios[i] === numeroAleatorio) {
            existe = true;
            break;
        }
    }
    if (!existe) {
        numerosAleatorios[contador] = numeroAleatorio;
        contador++;
    }
    existe = false;
}

// Ordenar números aleatorios
for (let i = 0; i < 9; i++) {
    numerosOrdenados[i] = numeros[numerosAleatorios[i] - 1];
}

// Mostrar números aleatorios
console.log("Números aleatorios:");
for (let i = 0; i < 9; i++) {
    process.stdout.write(numerosAleatorios[i] + " ");
}
console.log();

// Mostrar números ordenados
console.log("Números ordenados:");
for (let i = 0; i < 9; i++) {
    process.stdout.write(numerosOrdenados[i] + " ");
}
console.log();