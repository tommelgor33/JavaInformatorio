/*
    Positivos y divisibles por 7 : Realizar un programa que muestre por pantalla los
números enteros positivos que sean divisibles por 7 y que sean menores que 100.
*/

package clases.estructurado;
public class DivisiblePorSiete {
    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.print('.');

    }

}
