// bubble sort de la liste [54,26,93,17,77,31,44,55,20]

function bubbleSort(arr) {
  let n = arr.length;
  for (let i = 0; i < n - 1; i++) {
    for (let j = 0; j < n - i - 1; j++) {
      if (arr[j] > arr[j + 1]) {
        let temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
      }
    }
  }
  return arr;
}
// mostrar el resultado en consola
arr = [54, 26, 93, 17, 77, 31, 44, 55, 20];

console.log("lista sin ordernar: " + arr); // [54, 26, 93, 17, 77, 31, 44, 55, 20]
console.log("Ordenamiento burbuja: " + bubbleSort(arr)); // [17, 20, 26, 31, 44, 54, 55, 77, 93]
