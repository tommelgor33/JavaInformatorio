/*
Triangulo de asteriscos : Se le solicita que creen un programa que imprima un
triángulo de asteriscos en la consola.
*/

package clases.imperativa;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamanio del triangulo: ");
        short tam = sc.nextShort();
        String sf = "*";

        for(int i=0;i>0;i--){
            for (int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println("");
        }

        sc.close();
    }
}
