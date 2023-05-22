/*
Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre
en unicode y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char?
¿Qué es unicode?
*/

package clases.imperativa;

import java.util.Scanner;

public class Caracteres2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nomb = sc.next();

        char[] ch = nomb.toCharArray();

        System.out.println(ch);

        sc.close();
    }
}
