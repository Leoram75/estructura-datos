class Portatil extends Dispositivo {

    //Atributos
    private final static int DISCO_DURO_BASE = 250;
    private Integer discoDuro;

    
    //Constructores

    public Portatil(){
        this(PRECIO_BASE, PESO_BASE, CONSUMO_W, DISCO_DURO_BASE);
        
   }
   
    public Portatil(Double precioBase, Integer peso) {
        this(precioBase, peso, CONSUMO_W, DISCO_DURO_BASE);
        
    }

    public Portatil(Double precioBase, Integer peso, char consumoW, Integer discoDuro) {
        super(precioBase, peso, consumoW);
        this.discoDuro = discoDuro;
    }

    //Metodos

    public double calcularPrecio(){

        Double adicion = super.calcularPrecio();

        if (discoDuro > 250 && discoDuro <=500){
            adicion += 25;
        }
        
        if (discoDuro > 500 && discoDuro <= 1000){
            adicion += 65; 
        }
        
        if (discoDuro > 1000){
            adicion += 89;
        }

        return adicion;
    }   
    
}
