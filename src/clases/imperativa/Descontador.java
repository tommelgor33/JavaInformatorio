/*
Descontador: Se le solicita que guarde un número en un espacio de memoria y
discretamente dicho número 20 veces sin usar asignación. ¿Que operador podría
usar para hacerlo?
*/

package clases.imperativa;

import java.util.Scanner;

public class Descontador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numeroa ser incrementado hasta 20: ");

        short n1 = sc.nextShort();

        for (short i = 0; i < 21; i++) {
            System.out.println("Decrementando 20 veces: " + n1);
            n1--;
        }
        sc.close();
    }
}
