package clases.estructurado;

// Eliminación de un elemento: Dado un arreglo con valores enteros, realice la búsqueda de ese entero y si lo encuentra eliminarlo, si no lo encuentra informe por pantalla.

import java.util.Arrays;

public class EliminacionElementoArreglo {
    public static void main(String[] args) {
        int[] arreglo = {10, 5, 8, 3, 6, 2};
        int enteroBuscado = 8;

        // Mostrar el arreglo original
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));

        // Realizar la búsqueda y eliminación del entero si se encuentra
        boolean encontrado = false;
        int indiceEncontrado = -1;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == enteroBuscado) {
                encontrado = true;
                indiceEncontrado = i;
                break;
            }
        }

        if (encontrado) {
            // Desplazar los elementos siguientes al elemento encontrado
            for (int i = indiceEncontrado; i < arreglo.length - 1; i++) {
                arreglo[i] = arreglo[i + 1];
            }

            // Redimensionar el arreglo eliminando el último elemento duplicado
            arreglo = Arrays.copyOf(arreglo, arreglo.length - 1);

            System.out.println("El entero " + enteroBuscado + " ha sido eliminado.");
            System.out.println("Arreglo resultante: " + Arrays.toString(arreglo));
        } else {
            System.out.println("El entero " + enteroBuscado + " no se encuentra en el arreglo.");
        }
    }
}

