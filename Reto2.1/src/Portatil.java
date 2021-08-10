public class Portatil extends Dispositivo {

    //Atributos
    
    private int discoDuro;
    private final int DISCO_DURO_BASE = 250;

     //Constructores


    public Portatil(int discoDuro) {
        this.discoDuro = discoDuro;
    }
    public Portatil(int peso, char consumoW, double precioBase, int discoDuro) {
        super(peso, consumoW, precioBase);
        this.discoDuro = discoDuro;
    }
    public int getDiscoDuro() {
        return discoDuro;
    }
    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }
    public int getDISCO_DURO_BASE() {
        return DISCO_DURO_BASE;
    }

    public int calcularadicionDD(){
        if (discoDuro < 250){
            System.out.println(0);
        }else if (discoDuro > 250 && discoDuro <=500){
            System.out.println(25);
        }else if (discoDuro > 500 && discoDuro <= 1000){
            System.out.println(65); 
        }else{
            System.out.println(89);
        }
    }
}

   

    



    

