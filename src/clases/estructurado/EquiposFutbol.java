package clases.estructurado;

// Los equipos ganadores: Guardar en variables el nombre de 2 equipos de fútbol, luego en otras 2 variables el nombre de los entrenadores y luego guardar el nombre de los jugadores en distintos arreglos. Mostrar un encabezado con el nombre de cada equipo y por cada equipo mostrar los nombres de los jugadores. Permitir al usuario elegir qué equipo gana.

import java.util.Scanner;

public class EquiposFutbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables para los nombres de los equipos
        String equipo1 = "Equipo A";
        String equipo2 = "Equipo B";

        // Variables para los nombres de los entrenadores
        String entrenador1 = "Entrenador A";
        String entrenador2 = "Entrenador B";

        // Arreglos para los nombres de los jugadores
        String[] jugadoresEquipo1 = {"Jugador A1", "Jugador A2", "Jugador A3"};
        String[] jugadoresEquipo2 = {"Jugador B1", "Jugador B2", "Jugador B3"};

        // Mostrar encabezado
        System.out.println("--- Información de los Equipos ---");

        // Mostrar nombre de los equipos y jugadores
        System.out.println("Equipo: " + equipo1);
        System.out.println("Entrenador: " + entrenador1);
        System.out.println("Jugadores:");
        for (String jugador : jugadoresEquipo1) {
            System.out.println(jugador);
        }

        System.out.println();

        System.out.println("Equipo: " + equipo2);
        System.out.println("Entrenador: " + entrenador2);
        System.out.println("Jugadores:");
        for (String jugador : jugadoresEquipo2) {
            System.out.println(jugador);
        }

        // Permitir al usuario elegir qué equipo gana
        System.out.println("\n¿Qué equipo gana? (1 - " + equipo1 + " / 2 - " + equipo2 + ")");
        int opcionGanador = scanner.nextInt();

        // Determinar el equipo ganador
        String equipoGanador;
        if (opcionGanador == 1) {
            equipoGanador = equipo1;
        } else if (opcionGanador == 2) {
            equipoGanador = equipo2;
        } else {
            equipoGanador = "Ninguno";
        }

        // Mostrar el equipo ganador
        System.out.println("El equipo ganador es: " + equipoGanador);

        scanner.close();
    }
}
