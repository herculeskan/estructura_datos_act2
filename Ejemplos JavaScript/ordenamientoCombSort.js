// Ejemplo comb sort
function sort(arr) {
  let n = arr.length;
  // inicializar el gap
  let gap = n;

  // inicializar el swap como true para asegurar que se ejecute al menos una vez
  let swapped = true;

  // Mantener ejecutando mientras gap es más que 1 y la última iteración causó un swap
  while (gap != 1 || swapped == true) {
    // Encuentra el siguiente gap
    gap = Math.floor((gap * 10) / 13);
    if (gap < 1) {
      gap = 1;
    }
    // verificar el swapped
    swapped = false;
    // Comparar todos los elementos
    for (let i = 0; i < n - gap; i++) {
      if (arr[i] > arr[i + gap]) {
        // swap arr[i] y arr[i+gap]
        let temp = arr[i];
        arr[i] = arr[i + gap];
        arr[i + gap] = temp;
        // set swapped
        swapped = true;
      }
    }
  }
}

let arr = [9, 8, 7, 6, 5, 4, 3, 2, 1];
sort(arr);

console.log("Números ordenados:");
for (let i = 0; i < arr.length; i++) {
  process.stdout.write(arr[i] + " ");
}
console.log();
