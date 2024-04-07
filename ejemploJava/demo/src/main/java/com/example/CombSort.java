package com.example;

public class CombSort {
    // Ejemplo comb sort
    void sort(int arr[]) {
        int n = arr.length;
        // incializar el gap
        int gap = n;

        // inicializar el swap como true para asegurar que se ejecute al menos una vez
        boolean swapped = true;

        // Mantener ejecutando mientras gapes más que 1 y o la última iteración causó un
        // swap

        while (gap != 1 || swapped == true) {
            // Encuentra el siguiente gap
            gap = (gap * 10) / 13;
            if (gap < 1) {
                gap = 1;
            }
            // verificar el swapped
            swapped = false;
            // Comparar todos los elementos

            for (int i = 0; i < n - gap; i++) {
                if (arr[i] > arr[i + gap]) {
                    // swap arr[i] y arr[i+gap]
                    int temp = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = temp;
                    // set swapped
                    swapped = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        CombSort ob = new CombSort();
        int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        ob.sort(arr);

        System.out.println("Números ordenados:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
