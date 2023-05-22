/*
    Espero aprobar : Escribe un programa que imprima un título para el programa,
luego un listado (Seguido, NO con saltos de línea) de las N notas de mis exámenes,
donde los N números son guardados en variables o constantes según corresponda.
Luego obtenga el promedio de esas calificaciones y me diga si aprobé o no y con
cuanto
*/

package clases.estructurado;

import java.util.ArrayList;
import java.util.Scanner;

public class EsperoAprobar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Espero aprobar.");
        ArrayList<Short> notas = new ArrayList<Short>();

        System.out.println("Cuantas notas desea ingresar?: ");
        short nNotas = sc.nextShort();
        short acum = 0;

        for (int i = 0; i < nNotas; i++) {
            notas.add(sc.nextShort());
        }

        for (Short nota: notas) {
            acum += nota;
        }

        if (acum/nNotas>6){
            System.out.print("Aprobado, ");
        }else {
            System.out.print("desaprovado, ");
        }

        System.out.println("el promedio de las notas es: " + (acum/nNotas));

        sc.close();
    }
}
