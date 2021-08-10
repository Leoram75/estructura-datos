import java.util.*;


public class Ejercicio5 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int numero = (int)(Math.random()*100+1);
        int Adivinar;


        System.out.println("Por favor Introduzca un Numero: ");
        Adivinar = sc.nextInt();



       while(Adivinar == numero){
        System.out.println("Adivino el Numero");
       }
        if (Adivinar > numero){
        System.out.println("El numero que busca es Mayor");
        
        }else
        {
            System.out.println("El numero que busca en Menor");
        }
           


        sc.close();
    }        
    
}
