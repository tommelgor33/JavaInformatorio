/*
    Menú de opciones : Realice un menú de opciones, donde la opción se guarde en
una variable (Sin pedir por teclado), muestre la opción elegida y fuerce su salida
bucle.
*/

package clases.estructurado;

public class MenuOpciones {

    public static void main(String[] args) {
        int opcion = 0; // Almacena la opción elegida

        // Muestra el menú hasta que se elija una opción valda
        while (opcion == 0) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Salir");

            // Guarda la opción elegida a la variable
            opcion = 3;

            // Mostrar la opción elegida
            System.out.println("Opción elegida: " + opcion);
            }

        System.out.println("Fin del programa");
    }
}
