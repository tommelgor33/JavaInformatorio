package clases.imperativa;

import java.util.Scanner;

public class SumaDosNum {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos numeros a ser sumados: ");

        Short n1 = sc.nextShort();
        Short n2 = sc.nextShort();

        System.out.println("El resultado es: " + (n1 + n2));

        sc.close();
    }
}