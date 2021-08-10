import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int numero1, numero2;
        int suma, resta, multiplicacion, division;

        System.out.println("Introduzca el Numero 1: ");
        numero1 = sc.nextInt();
        System.out.println("Introduzca el Numero 2: ");
        numero2 = sc.nextInt();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;

        System.out.println("La Suma de: " + numero1 + " y " + numero2 + " es igual a: " + suma);
        System.out.println("La Resta de: " + numero1 + " y " + numero2 + " es igual a: " + resta);
        System.out.println("La Multiplicacion de: " + numero1 + " y " + numero2 + " es igual a: " + multiplicacion);
        System.out.println("La Division de: " + numero1 + " y " + numero2 + " es igual a: " + division);

        sc.close();
    }
}
