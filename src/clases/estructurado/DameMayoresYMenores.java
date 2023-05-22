/*
    Dame los mayores y los menores : Realizar un programa donde se guarden 5 en
un arreglo. Luego, el programa debe mostrar en pantalla el valor máximo y mínimo
de los números ingresados.
*/

package clases.estructurado;

import java.util.Arrays;

public class DameMayoresYMenores {
    public static void main(String[] args) {
        int[] numeros = {10, 5, 8, 3, 6};

        // Mostrar el arreglo de números
        System.out.println("Arreglo de números: " + Arrays.toString(numeros));

        // Encontrar el valor máximo y mínimo
        int maximo = numeros[0];
        int minimo = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }

            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        // Mostrar el valor máximo y mínimo
        System.out.println("Valor máximo: " + maximo);
        System.out.println("Valor mínimo: " + minimo);
    }
}

