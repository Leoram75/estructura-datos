public class App {
    public static void main(String[] args) {

        Dispositivo dispositivos[]=new Dispositivo[3];
        dispositivos[0]= new Portatil(500.0, 3, 'E', 250);
        dispositivos[1]= new Tablet();
        dispositivos[2]= new Dispositivo(600.0, 3, 'D',);
        PrecioTotal Solucion1 = new PrecioTotal(dispositivos);
        Solucion1.mostrarTotales();
        System.out.println("\n");
        
    }
}
