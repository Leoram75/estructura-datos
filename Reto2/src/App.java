public class App {
    public static void main(String[] args) {

        //Pruebas Publicas

        Dispositivo dispositivos[] = new Dispositivo[3];
        dispositivos[0] = new Portatil(500.0, 3, 'E', 250);
        dispositivos[1] = new Tablet();
        dispositivos[2] = new Dispositivo(600.0, 3, 'D');
        PrecioTotal solucion1 = new PrecioTotal(dispositivos);
        solucion1.mostrarTotales();
        System.out.println("\n");

        Dispositivo dispositivos2[] = new Dispositivo[7];
        dispositivos2[0] = new Tablet(150.0, 1);
        dispositivos2[1] = new Portatil(500.0, 2, 'E', 500);
        dispositivos2[2] = new Dispositivo();
        dispositivos2[3] = new Portatil(250.0, 4);
        dispositivos2[4] = new Tablet(400.0, 3, 'A', 4);
        dispositivos2[5] = new Dispositivo(50.0, 3);
        PrecioTotal solucion2 = new PrecioTotal(dispositivos2);
        solucion2.mostrarTotales();
        System.out.println();
     
    }
}



       