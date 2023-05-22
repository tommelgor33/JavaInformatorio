/*
    Mis amigos : Guarde en variables el nombre de N cantidad de amigos, itere sobre
esa cantidad mostrando el nombre de cada amigo.
*/

package clases.estructurado;

import java.util.ArrayList;
import java.util.Scanner;

public class MisAmigos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos amigos desea  guardar?: ");
        short nAmigos = sc.nextShort();

        ArrayList<String> arrayAmigos = new ArrayList<String>();
        System.out.println("Ingrese el nombre de sus amigos: ");

        for (int i = 0; i < nAmigos; i++) {
            arrayAmigos.add(sc.next());
        }

        System.out.println("El nombre de sus amigos son: ");
        for (String amigo:arrayAmigos ) {
            System.out.println(amigo);
        }

        sc.close();
    }
}
