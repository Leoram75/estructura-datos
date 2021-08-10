

public class Main {

    public static void main(String[] args){

        
        NuevoProyecto nuevoProyecto = new NuevoProyecto();
        //InteresSimple interesSimple = new InteresSimple();
        //InteresCompuesto interesCompuesto = new InteresCompuesto();
        //CompararInversion compararInversion = new compararInversion();
        
        
       
        System.out.println(nuevoProyecto.calcularInteresSimple());
        System.out.println(nuevoProyecto.calcularInteresCompuesto());
        System.out.println(nuevoProyecto.compararInversion(6,10000000,1.2));

        

    }

    
}
