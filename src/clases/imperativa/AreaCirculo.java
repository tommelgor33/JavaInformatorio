/*
    Cálculo del área de un círculo: Escribir un programa en Java que calcule el área
de un círculo con un radio de 5 unidades. Buscar la fórmula con la que se
resuelve.
*/

package clases.imperativa;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el radio del circulo: ");
        float radio = sc.nextFloat();

        System.out.println("En base al radio recibido el circulo tendra un area de: " + (radio*3.14));

        sc.close();
    }
}
