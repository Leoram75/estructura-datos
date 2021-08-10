class PrecioTotal {

    //Atributos
    private Double totalDispositivos = 0.0;
    private Double totalPortatiles = 0.0;
    private Double totalTablets = 0.0;
    private Dispositivo [] listaDispositivos;

    //Constructores
    PrecioTotal(Dispositivo[] pDispositivos){
        this.listaDispositivos = pDispositivos;
    }

    //Metodos
    public void mostrarTotales(){

        //Calculos Totales

        for (int i = 0; i < listaDispositivos.length; i++){
            
            if (listaDispositivos[i] instanceof Dispositivo){
                totalDispositivos += listaDispositivos[i].calcularPrecio();
            }
            if (listaDispositivos[i] instanceof Tablet){
                totalTablets += listaDispositivos[i].calcularPrecio();
            }
            if (listaDispositivos[i] instanceof Portatil){
                totalPortatiles += listaDispositivos[i].calcularPrecio();
            }
        }

    

        //Mostrar Resultados

        System.out.println("Total acerca de precios de dispositivos " + totalDispositivos);
        System.out.println("Total acerca de precios de tabletas " + totalTablets);
        System.out.println("Total acerca de precios de computadores portátiles " + totalPortatiles);



    }
}

    

