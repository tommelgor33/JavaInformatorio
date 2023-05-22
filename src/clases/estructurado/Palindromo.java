package clases.estructurado;

// Sera Palíndromo?: Dado un arreglo con caracteres formando una palabra, indicar si es o no un palíndromo.

public class Palindromo {
    public static void main(String[] args) {
        char[] arreglo = {'r', 'e', 'c', 'o', 'n', 'o', 'c', 'e', 'r'};

        // Mostrar el arreglo original
        System.out.println("Arreglo original: " + String.valueOf(arreglo));

        // Verificar si es palíndromo
        boolean esPalindromo = verificarPalindromo(arreglo);

        // Mostrar el resultado
        if (esPalindromo) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }
    }

    public static boolean verificarPalindromo(char[] arreglo) {
        int longitud = arreglo.length;
        for (int i = 0; i < longitud / 2; i++) {
            if (arreglo[i] != arreglo[longitud - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}

