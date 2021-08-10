import java.util.*;

public class EjercicioEnClase {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int CodigoEstudiante;
        int Cedula, Celular;
        String NombreEstudiante, DireccionEstudiante;

        System.out.println("Introduzca el Codigo del Estudiante:");
        CodigoEstudiante = sc.nextInt();
        System.out.println("Introduzca la Cedula del Estudiante:");
        Cedula = sc.nextInt();
        System.out.println("Introduzca el Celular del Estudiante:");
        Celular = sc.nextInt();
        System.out.println("Introduzca el Nombre del Estudiante:");
        NombreEstudiante = sc.next();
        System.out.println("Introduzca la direccion del Estudiante:");
        DireccionEstudiante = sc.next();

        System.out.println("El Codigo del Estudiante es: " + CodigoEstudiante);
        System.out.println("La Cedula del Estudiante es: " + Cedula);
        System.out.println("El Numero de Celular del Estudiante es: " + Celular);
        System.out.println("El Nombre del Estudiante es: " + NombreEstudiante);
        System.out.println("La Direccion del Estudiante es: " + DireccionEstudiante);

        sc.close();

        


    }
}
