public class Tablet extends Dispositivo {

    //Atributos
    
    private int memoriaRam;
    private final int MEMORIA_RAM_BASE = 1;
    private int adicionMR;

    
    public Tablet(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
    public Tablet(int peso, char consumoW, double precioBase, int memoriaRam, int adicionMR) {
        super(peso, consumoW, precioBase);
        this.memoriaRam = memoriaRam;
        this.adicionMR = adicionMR;
    }
    public int getMemoriaRam() {
        return memoriaRam;
    }
    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
    public int getMEMORIA_RAM_BASE() {
        return MEMORIA_RAM_BASE;
    }

    public int getAdicionMR() {
        return adicionMR;
    }
    public void setAdicionMR(int memoriaRam) {
        this.adicionMR = adicionMR;
    }

    public int calcularadicionMR(){

        if (this.memoriaRam < 1){
            return adicionMR = 0;
            //System.out.println(0);
        }else if (this.memoriaRam > 1 && this.memoriaRam <=2){
            return adicionMR = 18;
            //System.out.println(18);
        }else if (this.memoriaRam > 2 && this.memoriaRam <= 4){
            return adicionMR = 37;
            //System.out.println(37); 
        }else{
            return adicionMR = 69;
            //System.out.println(69);
        }
    }

    public int calcularadicionPeso(){

        if (this.getPeso() < 1){
            return peso = 0;
            //System.out.println(0);
        }else if (this.getPeso() > 1 && this.getPeso() <=2){
            return peso = 20;
            //System.out.println(20);
        }else if (this.getPeso() > 2 && this.getPeso() <= 3){
            return peso = 35;
            //System.out.println(35);
        }else if (this.getPeso() > 3 && this.getPeso() <= 4){
            return peso = 45;
            //System.out.println(45);  
        }else{
            return peso = 73;
            //System.out.println(73);
        }
    }

    public int calcularadicion(){
        int adicion = calcularadicionMR() + calcularadicionPeso();
        return (adicion);
    }

    public double calcularPrecio(){

        return getPrecioBase() + calcularadicion();

        }

      



    
}
