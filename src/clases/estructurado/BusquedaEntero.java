/*
    Dado un arreglo con valores enteros, realice la
búsqueda de ese entero, si encontró el entero mostrarlo por pantalla sino muestre
por pantalla que no lo encontró.
*/

package clases.estructurado;

import java.util.Arrays;
import java.util.Scanner;

public class BusquedaEntero {
    public static void main(String[] args) {
        // Arreglo con valores enteros
        int[] arreglo = {10, 5, 8, 3, 6, 2};

        // Mostrar el arreglo original
        System.out.println("Arreglo: " + Arrays.toString(arreglo));

        // Leer el entero a buscar
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el entero a buscar: ");
        int enteroBuscado = scanner.nextInt();

        // Realizar la búsqueda
        boolean encontrado = false;
        for (int valor : arreglo) {
            if (valor == enteroBuscado) {
                encontrado = true;
                break;
            }
        }

        // Mostrar el resultado
        if (encontrado) {
            System.out.println("Se encontró el entero " + enteroBuscado + " en el arreglo.");
        } else {
            System.out.println("No se encontró el entero " + enteroBuscado + " en el arreglo.");
        }
        scanner.close();
    }
}

