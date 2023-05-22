/*
    Cálculo de la media aritmética:
Escribir un programa en Java que calcule la media aritmética de un conjunto de
números. Utilizar la fórmula: media = (n1 + n2 + ... + nk) / k, donde n1, n2, ..., nk son
los números y k es el número total de elementos. Utilicen variables y constantes
según corresponda.
*/

package clases.imperativa;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese tres numeros");
        short n1 = sc.nextShort();
        short n2 = sc.nextShort();
        short n3 = sc.nextShort();

        System.out.printf("La media de %d, %d y %d es: %d",n1,n2,n3,(n1+n2+n3)/3);

        sc.close();
    }
}
