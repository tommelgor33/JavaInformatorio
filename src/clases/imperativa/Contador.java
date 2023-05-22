/*
Contador: Se le solicita que guarde un número en un espacio de memoria e
incremente dicho número 20 veces sin usar asignación. ¿Que operador podría usar
para hacerlo?
*/

package clases.imperativa;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numeroa ser incrementado hasta 20: ");

        short n1 = sc.nextShort();

        for (n1 = n1; n1 < 21; n1++) {
            System.out.println("Incrementando hasta 20: " + n1);
        }

        sc.close();
    }
}
