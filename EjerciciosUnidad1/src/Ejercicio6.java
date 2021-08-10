import java.util.*;


public class Ejercicio6 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String sexo;
        int altura, PesoIdeal, PesoIdealM;

        System.out.println("Ingrese su Sexo: ");
        sexo = sc.next();
        System.out.println("Ingrese su Altura en Centimetros: ");
        altura = sc.nextInt();

        

        if(sexo == "H"){
            PesoIdeal = altura - 110;
            System.out.println(PesoIdeal);
        }else{
            PesoIdealM= altura - 120;
            System.out.println(PesoIdealM);

        }
        sc.close();
}

}
