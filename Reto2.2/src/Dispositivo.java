public class Dispositivo {

    protected final static char CONSUMO_W = 'F';
    protected final static Double PRECIO_BASE = 200.0;
    protected final static Integer PESO_BASE = 2;

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
    public Dispositivo(Integer peso, char consumoW, Double precioBase) {
        this.peso = peso;
        this.precioBase = precioBase;
        comprobarconsumow(consumoW);
    }
    
}
