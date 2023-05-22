/*
    Nombre de bebida: Se le solicita que guarde en espacios de memoria distinta la
información de: El nombre de su última mascota y nombre de la última película
vista. Por último mostrarlo por pantalla con el siguiente formato:
“Nombre de la próxima bebida : ” {Nombre de mascota} {Nombre de pelicula}
*/

package clases.imperativa;

import java.util.Scanner;

public class NombreBebidas {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de su ultima mascota: ");
        String n1 = sc.next();

        System.out.println("Ingrese el nombre de su ultima pelicula: ");
        String n2 = sc.next();

        System.out.println("Nombre de la proxima bebida: " + n1 + " " + n2);

        System.out.println("El resultado es: " + (n1 + n2));

        sc.close();
    }
}
