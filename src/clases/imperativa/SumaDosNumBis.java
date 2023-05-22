package clases.imperativa;

import java.util.Scanner;

public class SumaDosNumBis {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos numeros a ser sumados: ");

        short n1 = sc.nextShort();
        short n2 = sc.nextShort();

        String str;
        if ((n1+n2)%2==0){
            str = "par";
        }else{
            str = "inpar";
        }

        System.out.println("El resultado es: " + (n1 + n2) + " y es " + str);

        sc.close();
    }
}