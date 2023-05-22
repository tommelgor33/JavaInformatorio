/*
    Suma del rango de números: Escribir un programa que encuentre la suma de los
números impares en un rango de números enteros guardados
*/

package clases.estructurado;
public class SumaRango {
    public static void main(String[] args) {
        int inicio = 1; // Inicio del rango
        int fin = 100; // Fin del rango
        int suma = 0;

        for (int i = inicio; i <= fin; i++) {
            if (i % 2 != 0) {
                suma += i;
            }
        }

        System.out.println("La suma de los números impares en el rango " + inicio + " a " + fin + " es: " + suma);

    }
}
