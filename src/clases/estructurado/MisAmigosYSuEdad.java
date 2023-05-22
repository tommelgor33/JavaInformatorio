/*
    Mis amigos y su edad: Guarda en variables el nombre de N cantidad de amigos,
itere sobre esa cantidad luego muestre el nombre de cada amigo si y sólo si este
amigo es mayor de edad, en caso de ser menor de edad imprima un mensaje
diciendole a ese amigo porque no lo muestra por pantalla.

*/

package clases.estructurado;

import java.util.Scanner;

public class MisAmigosYSuEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos amigos desea ingresar?: ");
        int cantidadAmigos = scanner.nextInt();

        String[] nombres = new String[cantidadAmigos];
        int[] edades = new int[cantidadAmigos];

        for (int i = 0; i < cantidadAmigos; i++) {
            System.out.print("Ingrese el nombre de su amigo numero: " + (i + 1) + ": ");
            nombres[i] = scanner.next();

            System.out.print("Ingrese la edad de su amigo numero: " + (i + 1) + ": ");
            edades[i] = scanner.nextInt();
        }

        for (int j = 0; j < cantidadAmigos; j++) {
            if (edades[j] >= 18) {
                System.out.println("Amigo mayor de edad: " + nombres[j]);
            } else {
                System.out.println("Amigo menor de edad: " + nombres[j] + ". No se muestra por por pantalla.");
            }
        }
    }
}
