/*
Potencia de 2 y 3: Se le solicita que guarde en un espacio de memoria un número y
luego haga la potencia de ese número al cuadrado y al cubo.
*/

//import java.Math;

package clases.imperativa;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Potencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para ser elevado y la potencia a la que quiere elevarlo: ");

        short n1 = sc.nextShort();
        short n2 = sc.nextShort();

        System.out.printf("Elevamos %d a %d y da como resultado %5.2f", n1, n2,pow(n1,n2));

        sc.close();
    }
}
