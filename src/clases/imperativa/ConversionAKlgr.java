/*
Conversión a kilogramos: Guarde en un espacio de memoria sus libras y luego, en
otro espacio de memoria realice la conversión de esas libras a kilogramos. Utilice
una constante de los valores que no van a cambiar en esta conversión. Muestre el
resultado por pantalla
*/

package clases.imperativa;

import java.util.Scanner;

public class ConversionAKlgr {
    static final float LibranEnKilos = 0.4536F;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese las libras a convertir: ");
        float libras = sc.nextFloat();

        System.out.printf("%.2f libras son %.2f kilos.",libras, (LibranEnKilos*libras));

        sc.close();
    }
}
