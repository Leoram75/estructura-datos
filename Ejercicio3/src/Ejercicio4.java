import java.util.Scanner;

public class Ejercicio4 {
    Scanner sc = new Scanner(System.in);
        int N, m, d;
        
        System.out.println("Por favor, introduzca el de N: ");
        N = sc.nextInt();
        System.out.println("Por favor, introduzca el de m: ");
        m = sc.nextInt();
        
        //Math.pow devuelve un número de tipo double es necesario convertirlo a int para hacer la división entre enteros
        
        d = (int)Math.pow(10,m);
        N = N/d;
        System.out.println("Número modificado " + N);
        sc.close();
    }
}
