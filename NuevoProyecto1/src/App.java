public class App {
    public static void main(String[] args) throws Exception {
       
        NuevoProyecto1 nuevoProyecto = new NuevoProyecto1();

        
        //InteresSimple interesSimple = new InteresSimple();
        //InteresCompuesto interesCompuesto = new InteresCompuesto();
        //CompararInversion compararInversion = new compararInversion();
        
        
       
        System.out.println(nuevoProyecto.calcularInteresSimple());
        System.out.println(nuevoProyecto.calcularInteresCompuesto());
        System.out.println(nuevoProyecto.compararInversion(6,10000000,1.2));
    }
}
