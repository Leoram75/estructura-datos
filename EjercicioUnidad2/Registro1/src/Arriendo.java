public class Arriendo extends Registro {

    private int tipo2;

    public Arriendo(String tipo, int tipo2){
        super(tipo);
        this.tipo2 = tipo2;
    }

    public int tipoVivienda(){
        return tipo2;
    }
    
}
