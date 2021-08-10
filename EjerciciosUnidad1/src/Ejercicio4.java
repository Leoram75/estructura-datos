import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Introduzca un Numero: ");
        n = sc.nextInt();

        System.out.println("Tabla del: " + n);

        for(int i=1; i<=10; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }

        sc.close();

    }
}
