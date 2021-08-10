public class Pruebas {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        //Atributos

        double pMonto, pInteres;
        double interesSimple, interesCompuesto, diferencia;
        int pPeriodo;

        pMonto = 10000000;
        pInteres = 1.2;
        pPeriodo = 6;

        interesSimple = pMonto * (pInteres/100) * pPeriodo;
        System.out.println(interesSimple);

        interesCompuesto = pMonto * (Math.pow((1+(pInteres/100)),pPeriodo) - 1);
        System.out.println(interesCompuesto);

        diferencia = interesCompuesto - interesSimple;
        System.out.println(diferencia);


    }
}
    
