import java.util.*;

public class Ejercicio3 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int sueldo, horas;
        int valorHora = 30000;

        System.out.println("Introduzca el Numero de Horas Trabajadas: ");
        horas = sc.nextInt();

        sueldo = valorHora * horas;

        System.out.println("El Sueldo del Trabajador es: " + sueldo);



        sc.close();
    
}

}
