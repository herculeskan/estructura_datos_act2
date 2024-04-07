package com.example;

public class OrdenamientoRapido {
    // Ejemplo de Ordenamiento rápido en estructura de Datos
    public static void main(String[] args) {
        int[] numeros = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int[] numerosOrdenados = new int[9];
        int pivote = numeros[0];
        int contador = 0;

        // Ordenar números
        for (int i = 1; i < 9; i++) {
            if (numeros[i] < pivote) {
                numerosOrdenados[contador] = numeros[i];
                contador++;
            }
        }
        numerosOrdenados[contador] = pivote;
        contador++;
        for (int i = 1; i < 9; i++) {
            if (numeros[i] > pivote) {
                numerosOrdenados[contador] = numeros[i];
                contador++;
            }
        }

        // Mostrar números ordenados
        System.out.println("Números ordenados:");
        for (int i = 0; i < 9; i++) {
            System.out.print(numerosOrdenados[i] + " ");
        }
        System.out.println();
    }

}
