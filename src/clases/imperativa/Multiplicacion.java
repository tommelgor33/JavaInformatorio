/*
    Multiplicación: Se le solicita que guarde dos números reales y los multiplique, luego
guarde otros dos números enteros y multiplicarlos. Guarde en un espacio de
memoria la suma entre estas dos multiplicaciones ¿Que resultado le da? ¿Entero o
real? ¿Por qué?
*/

package clases.imperativa;

public class Multiplicacion {
    public static void main(String[] args) {
        float f1 = 4.4f, f2 = 6.6f;
        float f3 = f1*f2;

        int i1 = 2, i2 = 3, i3 = i1*i2;

        float r = f3 + i3;

        System.out.println("Da como resultado: " + r + "que es real porque lo guardamos como tal.");

    }
}
