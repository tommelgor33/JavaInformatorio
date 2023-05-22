/*
    Conversión de grados Celsius a grados Fahrenheit : Escribir un programa en
Java que convierta una temperatura en grados Celsius a grados Fahrenheit. Buscar
la fórmula con la que se resuelve
*/
package clases.imperativa;

import java.util.Scanner;

public class CelsiusAFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los celsius a convertir en fahrenheit: ");
        float celcius = sc.nextFloat();

        System.out.printf("%.2f celcius son %.2f fahrenheit.", celcius, ((celcius+40)*2));

        sc.close();
    }
}
