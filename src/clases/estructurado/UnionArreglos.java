/*
    Unión de dos arreglos : Dado dos arreglos con cualquier tipo de valor (Ya sea
String, Char, Integer, etc), realice la unión de ambos arreglos en un tercer arreglo.
*/

package clases.estructurado;

import java.util.Arrays;

public class UnionArreglos {
    public static void main(String[] args) {
        // Arreglos de ejemplo
        String[] arreglo1 = {"Hola", "Mundo"};
        String[] arreglo2 = {"¡Bienvenidos", "a", "todos!"};

        // Realizar la unión de los arreglos
        int longitudUnion = arreglo1.length + arreglo2.length;
        String[] union = new String[longitudUnion];

        // Copiar los elementos del arreglo1 al arreglo de unión
        System.arraycopy(arreglo1, 0, union, 0, arreglo1.length);

        // Copiar los elementos del arreglo2 al arreglo de unión
        System.arraycopy(arreglo2, 0, union, arreglo1.length, arreglo2.length);

        // Mostrar el arreglo de unión
        System.out.println("Arreglo de unión: " + Arrays.toString(union));
    }
}
