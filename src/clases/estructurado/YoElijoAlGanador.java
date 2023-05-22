/*
    12. Yo elijo el equipo ganador : Modifique el ejercicio anterior en donde usted debe
crear un menú de opciones en donde en ese menú de opciones debe elegir qué
equipo de fútbol quiere saber la información del el ejercicio 11.
*/

package clases.estructurado;

import java.util.Scanner;

public class YoElijoAlGanador {
    public static void main(String[] args) {
        // Guardar el nombre de los equipos
        String equipo1 = "Equipo A";
        String equipo2 = "Equipo B";

        // Guardar el nombre de los entrenadores
        String entrenador1 = "Entrenador A";
        String entrenador2 = "Entrenador B";

        // Guardar los nombres de los jugadores
        String[] jugadoresEquipo1 = {"Jugador 1 - Equipo A", "Jugador 2 - Equipo A"};
        String[] jugadoresEquipo2 = {"Jugador 1 - Equipo B", "Jugador 2 - Equipo B"};

        // Crear el objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Mostrar el menú de opciones
        System.out.println("Menú de opciones:");
        System.out.println("1. Mostrar información del " + equipo1);
        System.out.println("2. Mostrar información del " + equipo2);
        System.out.println("3. Salir");

        // Leer la opción seleccionada por el usuario
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        // Procesar la opción seleccionada
        switch (opcion) {
            case 1:
                mostrarInformacionEquipo(equipo1, entrenador1, jugadoresEquipo1);
                break;
            case 2:
                mostrarInformacionEquipo(equipo2, entrenador2, jugadoresEquipo2);
                break;
            case 3:
                System.out.println("Fin del programa");
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
        scanner.close();
    }

    // Método para mostrar la información de un equipo
    private static void mostrarInformacionEquipo(String nombreEquipo, String entrenador, String[] jugadores) {
        System.out.println("Información del equipo: " + nombreEquipo);
        System.out.println("==============================");
        System.out.println("Entrenador: " + entrenador);
        System.out.println("Jugadores:");
        for (String jugador : jugadores) {
            System.out.println("- " + jugador);
        }
    }
}
