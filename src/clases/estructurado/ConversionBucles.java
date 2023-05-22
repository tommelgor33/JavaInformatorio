/*
    Convierto lo que me da la gana: Demuestre cómo convertir un bucle WHILE en un
DO WHILE.
Convierto lo que me da la gana parte 2: Demuestre cómo convertir un bucle
WHILE en un bucle FOR.
*/
package clases.estructurado;

public class ConversionBucles {
    public static void main(String[] args) {
        short i = 0;
        while ( i < 5){
            System.out.print(i + " ");
            i++;
        }

        i=0;
        do {
            System.out.print(i + " ");
            i++;
        }while (i<5);

        for (int j = 0; j < 5; j++) {
            System.out.print(j + " ");
        }
    }
}
