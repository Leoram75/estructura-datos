public class Dispositivo {

    //Constantes y Atributos
    protected int peso;
    private char consumoW;
    private double precioBase;   
    private final int PESO_BASE = 2;
    private final char CONSUMO_W_BASE = 'F';
    private final double PRECIO_BASE = 200.0;

    //Constructores

    public Dispositivo(){

        this.precioBase = 0.0;
        this.peso = 0;

    }

    
    public Dispositivo(int peso, char consumoW, double precioBase) {
        this.peso = peso;
        this.consumoW = consumoW;
        this.precioBase = precioBase;
    }
    public Dispositivo(double d, int i, char c) {
    }


    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public char getConsumoW() {
        return consumoW;
    }
    public void setConsumoW(char consumoW) {
        this.consumoW = consumoW;
    }
    public double getPrecioBase() {
        return precioBase;
    }
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    public int getPESO_BASE() {
        return PESO_BASE;
    }
    public char getCONSUMO_W_BASE() {
        return CONSUMO_W_BASE;
    }
    public double getPRECIO_BASE() {
        return PRECIO_BASE;
    }

    public void comprobarconsumow(char consumoW){

        if (consumoW != 'F') {
            this.consumoW = consumoW;
        } else {
            this.consumoW = CONSUMO_W_BASE;
        }

        int adicionCW;
        switch (consumoW) {
            case 'A': adicionCW = 80;             
                 break;
            case 'B': adicionCW = 70;             
                 break;
            case 'C': adicionCW = 60;             
                 break;
            case 'D': adicionCW = 50;             
                 break;
            case 'E': adicionCW = 40;             
                 break;
            case 'F': adicionCW = 30;             
                 break;
            default: adicionCW = 0;
                 break;
         }
         System.out.println(adicionCW);
    }
    
    
}
