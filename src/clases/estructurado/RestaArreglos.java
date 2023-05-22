/*
    Restalos, prohibido menores a ceros : Cree dos arreglos con números decimales,
luego recortarlos y reste ambos arreglos el resultado aplicarlos a un tercer arreglo, si
la resta da negativo entonces guarde 0.
*/

package clases.estructurado;

import java.util.Arrays;

public class RestaArreglos {
    public static void main(String[] args) {
        double[] arreglo1 = {10.5, 8.2, 7.3, 6.7};
        double[] arreglo2 = {5.5, 3.8, 2.1, 9.0};
        double[] resultado = new double[arreglo1.length];

        // Realizar la resta y aplicar el resultado al arreglo resultado
        for (int i = 0; i < arreglo1.length; i++) {
            resultado[i] = arreglo1[i] - arreglo2[i];
            if (resultado[i] < 0) {
                resultado[i] = 0;
            }
        }

        // Mostrar los arreglos originales y el resultado
        System.out.println("Arreglo 1: " + Arrays.toString(arreglo1));
        System.out.println("Arreglo 2: " + Arrays.toString(arreglo2));
        System.out.println("Resultado: " + Arrays.toString(resultado));
    }
}
