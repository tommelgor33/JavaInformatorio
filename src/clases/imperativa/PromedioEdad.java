/*
Promedio de edad : Guarde en diferentes espacios de memoria distintos valores de
edad y los nombres de esas personas, luego saque su promedio e imprima por
pantalla el nombre de la persona, su edad. Por último imprimir el promedio de sus
edades.
*/

package clases.imperativa;

import java.util.Scanner;

public class PromedioEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomb = new String[3];
        System.out.println("ingrese el nombre de tres personas: ");
        nomb[0] = sc.next();
        nomb[1] = sc.next();
        nomb[2] = sc.next();

        short[] edad = new short[3];
        System.out.println("ingrese la edad de tres personas: ");
        edad[0] = sc.nextShort();
        edad[1] = sc.nextShort();
        edad[2] = sc.nextShort();

        System.out.printf("Se guardo a:%n%s de %d edad.%n%s de %d edad.%n%s de %d edad.%nY en promedio tienen %d.",
        nomb[0],edad[0],nomb[1],edad[1],nomb[2],edad[2],((edad[0]+edad[1]+edad[2])/3)
        );

    }
}
