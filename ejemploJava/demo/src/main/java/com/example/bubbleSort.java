package com.example;

//método para mostrar la lista
public class bubbleSort {
    public static void mostrarLista(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // bubble sort de la liste [54,26,93,17,77,31,44,55,20]
        int[] liste = { 54, 26, 93, 17, 77, 31, 44, 55, 20 };
        System.out.println("Mostrar la lista sin ordenar");
        mostrarLista(liste); // mostrar la liste sin ordenar
        int n = liste.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (liste[j - 1] > liste[j]) {
                    // echanges les elements
                    temp = liste[j - 1];
                    liste[j - 1] = liste[j];
                    liste[j] = temp;
                }
            }
        }
        // Mostrar lista ordenada
        System.out.println("Mostrar la lista ordenada");
        mostrarLista(liste);

    }
}