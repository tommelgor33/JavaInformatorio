/*
    Conversión de dólares a pesos: Escribir un programa en Java que solicite al
usuario una cantidad en dólares y muestre el equivalente en pesos, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 dólar = 20 pesos, y el
usuario ingresa 50 dólares, el programa deberá mostrar 1000 pesos.
*/

package clases.imperativa;

import java.util.Scanner;

public class DolarAPesos {
    static final short precioDolar = 200;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dolares a convertir: ");
        short dolares = sc.nextShort();

        System.out.printf("%d dolares son %d pesos.", dolares, (dolares*precioDolar));
    }
}
