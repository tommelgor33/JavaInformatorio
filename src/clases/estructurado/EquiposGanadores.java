/*
    Los equipos ganadores : Guarde en variables el nombre de 2 equipos de fútbol,
luego en otras 2 variables el nombre de los entrenadores y luego guarde el nombre
de los jugadores en distintas variables. Luego muestre un encabezado con el
nombre de cada equipo y por cada equipo muestre los nombres de los jugadores.
*/

package clases.estructurado;

public class EquiposGanadores {
    public static void main(String[] args) {
        // Guardar el nombre de los equipos
        String equipo1 = "Equipo A";
        String equipo2 = "Equipo B";

        // Guardar el nombre de los entrenadores
        String entrenador1 = "Entrenador A";
        String entrenador2 = "Entrenador B";

        // Guardar los nombres de los jugadores
        String jugador1Equipo1 = "Jugador 1 - Equipo A";
        String jugador2Equipo1 = "Jugador 2 - Equipo A";
        String jugador1Equipo2 = "Jugador 1 - Equipo B";
        String jugador2Equipo2 = "Jugador 2 - Equipo B";

        // Mostrar el encabezado
        System.out.println("Equipos de fútbol:");
        System.out.println("=================");
        System.out.println("Equipo: " + equipo1);
        System.out.println("Entrenador: " + entrenador1);
        System.out.println("Jugadores:");
        System.out.println("- " + jugador1Equipo1);
        System.out.println("- " + jugador2Equipo1);
        System.out.println();
        System.out.println("Equipo: " + equipo2);
        System.out.println("Entrenador: " + entrenador2);
        System.out.println("Jugadores:");
        System.out.println("- " + jugador1Equipo2);
        System.out.println("- " + jugador2Equipo2);
    }
}
