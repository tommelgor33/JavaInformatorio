package clases.estructurado;

// Traslado de posiciones en un arreglo: Dado un arreglo de enteros, una posición del arreglo y la cantidad de N traslados a hacer en el arreglo. Tomar el elemento de la posición del arreglo y trasladarlo N cantidad de veces, si el traslado es mayor al tamaño del arreglo, informar por pantalla.

import java.util.Arrays;

public class TrasladoPosicionesArreglo {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5};
        int posicion = 2; // Posición del arreglo (índice) a trasladar
        int traslados = 3; // Cantidad de traslados a realizar

        // Mostrar el arreglo original
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));

        // Realizar el traslado
        int longitudArreglo = arreglo.length;
        int elementoTrasladado = arreglo[posicion];

        // Calcular la posición trasladada
        int posicionTrasladada = (posicion + traslados) % longitudArreglo;

        // Verificar si la posición trasladada es mayor a la longitud del arreglo
        if (posicionTrasladada < 0) {
            posicionTrasladada += longitudArreglo;
        }

        // Trasladar el elemento N cantidad de veces
        for (int i = 0; i < traslados; i++) {
            int siguientePosicion = (posicionTrasladada + i) % longitudArreglo;
            int temp = arreglo[siguientePosicion];
            arreglo[siguientePosicion] = elementoTrasladado;
            elementoTrasladado = temp;
        }

        // Mostrar el arreglo después del traslado
        System.out.println("Arreglo después del traslado: " + Arrays.toString(arreglo));
    }
}