class Dispositivo {

    //Constantes y Atributos
    protected final static char CONSUMO_W='F';
    protected final static Double PRECIO_BASE=200.0;
    protected final static Integer PESO_BASE=2;


    protected Double precioBase;    
    protected char consumoW;
    protected Integer peso;

        
    //Constructores

    public Dispositivo(){
        this(PRECIO_BASE, PESO_BASE, CONSUMO_W);
    }
  
    public Dispositivo(Double precioBase, Integer peso){

        this(precioBase, peso, CONSUMO_W);        

    }    
    public Dispositivo(Double precioBase, Integer peso, char consumoW) {
        this.peso = peso;
        this.precioBase = precioBase;
        comprobarconsumow(consumoW);
    }

    //Metodos

    public void comprobarconsumow(char consumoW){

        if (consumoW >= 2 && consumoW <= 20) {
            this.consumoW = consumoW;
        } else {
            this.consumoW = CONSUMO_W;
        }
    }

    public double calcularPrecio(){

        Double adicion = 0.0;

        switch (consumoW) {
            case 'A': adicion += 80.0;             
                 break;
            case 'B': adicion += 70.0;             
                 break;
            case 'C': adicion += 60.0;             
                 break;
            case 'D': adicion += 50.0;             
                 break;
            case 'E': adicion += 40.0;             
                 break;
            case 'F': adicion += 30.0;             
                 break;
            }

            if (peso > 1 && peso <=2){
                adicion +=20.0;
            }else if (peso > 2 && peso <= 3){
                adicion += 35.0;
            }else if (peso > 3 && peso <= 4){
                adicion += 45.0;  
            }else if(peso > 4){
                adicion += 73.0;
            }

            return precioBase + adicion;
         
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    
    /*public void setPrecioBase (double precioBase) {
        this.precioBase = precioBase;
    }*/

    public char getConsumoW() {
        return consumoW;
    }

    /*public void setConsumoW(char consumoW) {
        this.consumoW = consumoW;
    }*/

    public Integer getPeso() {
        return peso;
    }

}

