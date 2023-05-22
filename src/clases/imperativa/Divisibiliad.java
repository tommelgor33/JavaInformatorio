/*
        Cálculo de divisibilidad: Se le solicita que guarden dos números enteros y los
        sumen, determine si el primer número es divisible por el segundo número y muestre
        el resultado.
*/


package clases.imperativa;

import java.util.Scanner;
public class Divisibiliad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos numeros a ser sumados: ");

        Short n1 = sc.nextShort();
        Short n2 = sc.nextShort();

        Short n3 = (short) (n1  +  n2);

        if((Short.compare(n1, n2)) >= 0) {
            System.out.println("Es divisible y da como resultado: " + (n2/n1));
        }else{
            System.out.println("No es divisible.");
        }
    }
}
