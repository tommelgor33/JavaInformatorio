package clases.estructurado;

// Inversión de un arreglo: Dado un arreglo de enteros, invertir el orden de los elementos.

import java.util.Arrays;

public class InversionArreglo {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5};

        // Mostrar el arreglo original
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));

        // Invertir el arreglo
        int longitudArreglo = arreglo.length;
        for (int i = 0; i < longitudArreglo / 2; i++) {
            int temp = arreglo[i];
            arreglo[i] = arreglo[longitudArreglo - 1 - i];
            arreglo[longitudArreglo - 1 - i] = temp;
        }

        // Mostrar el arreglo invertido
        System.out.println("Arreglo invertido: " + Arrays.toString(arreglo));
    }
}

