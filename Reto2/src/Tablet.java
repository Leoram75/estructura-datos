class Tablet extends Dispositivo {

       
    //Atributos
        
        private final static Integer MEMORIA_RAM_BASE = 1;
        private Integer memoriaRam;


     //Constructores
     public Tablet(){
        this(PRECIO_BASE, PESO_BASE, CONSUMO_W, MEMORIA_RAM_BASE);
        
   }

    // constructor con argumentos

    public Tablet(double precioBase, int peso) {
        
        this(precioBase, peso, CONSUMO_W, MEMORIA_RAM_BASE);
    }
    

    public Tablet(double precioBase, int peso, char consumoW, int memoriaRam) {
        super(precioBase, peso, consumoW);
        this.memoriaRam = memoriaRam;
    }

    //Metodos

    public double calcularPrecio(){

        Double adicion=super.calcularPrecio();

            if (memoriaRam > 1 && memoriaRam <=2){
                adicion += 18.0;
            }
            
            if (memoriaRam > 2 && memoriaRam <= 4){
                adicion += 37.0;                
            }
            
            if (memoriaRam > 4){
                adicion += 69.0;
            }

            return adicion;

        }

        public Integer getMemoriaRam(){
            return memoriaRam;
        } 


}
