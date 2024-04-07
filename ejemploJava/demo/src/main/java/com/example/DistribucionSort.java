package com.example;

public class DistribucionSort {
    // Ejemplo de distribución Sort
    public static void main(String[] args) {
        int[] numeros = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int[] numerosOrdenados = new int[9];
        int[] contador = new int[9];
        int[] numerosOrdenados2 = new int[9];
        int[] contador2 = new int[9];
        int pivote = numeros[0];
        int pivote2 = numeros[8];
        int contadorPivote = 0;
        int contadorPivote2 = 0;

        // Ordenar números
        for (int i = 0; i < 9; i++) {
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
        System.out.println("Números ordenados:");
        for (int i = 0; i < contadorPivote; i++) {
            System.out.print(numerosOrdenados[i] + " ");
        }
        for (int i = 0; i < contadorPivote2; i++) {
            System.out.print(numerosOrdenados2[i] + " ");
        }
        System.out.println();
    }
}
