package com.example;

public class OrdenamientoAleatorio {
    // Ejemplo de ordenamiento aleatorio estructura de datos
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] numerosAleatorios = new int[9];
        int[] numerosOrdenados = new int[9];
        int numeroAleatorio;
        int contador = 0;
        boolean existe = false;

        // Generar números aleatorios
        while (contador < 9) {
            numeroAleatorio = (int) (Math.random() * 9) + 1;
            for (int i = 0; i < 9; i++) {
                if (numerosAleatorios[i] == numeroAleatorio) {
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
        for (int i = 0; i < 9; i++) {
            numerosOrdenados[i] = numeros[numerosAleatorios[i] - 1];
        }

        // Mostrar números aleatorios
        System.out.println("Números aleatorios:");
        for (int i = 0; i < 9; i++) {
            System.out.print(numerosAleatorios[i] + " ");
        }
        System.out.println();

        // Mostrar números ordenados
        System.out.println("Números ordenados:");
        for (int i = 0; i < 9; i++) {
            System.out.print(numerosOrdenados[i] + " ");
        }
        System.out.println();
    }
}
