import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String Alumno;
        float nota1, nota2, nota3, promedio;

        System.out.println("Introduzca el Nombre del Alumno: ");
        Alumno = sc.next();
        System.out.println("Introduzca la Nota 1: ");
        nota1 = sc.nextFloat();
        System.out.println("Introduzca la Nota 2: ");
        nota2 = sc.nextFloat();
        System.out.println("Introduzca la Nota 3: ");
        nota3 = sc.nextFloat();

        promedio = (nota1 + nota2 + nota3)/3;

        if (promedio >= 3){
            System.out.println("El estudiante Aprobo");
        
        }else {
            System.out.println("El estudiante No Aprobo");
        }
           

        System.out.println("El Promedio del Estudiante " + Alumno + " es: " + promedio);

        sc.close();
}

}
