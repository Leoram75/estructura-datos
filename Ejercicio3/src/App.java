import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        var sc = new Scanner(System.in);
        int valor;
        System.out.println("Por favor ingrese un numero");
        valor = sc.nextInt();
        System.out.println(valor + (valor%10==0 ? " Es divisible en 10" : "No es divisible en 10"));
        sc.close();



    }
}
