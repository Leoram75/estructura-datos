public class Leasing extends Registro {

    private int tipo3;

    public Leasing(String tipo, int tipo3){
        super(tipo);
        this.tipo3 = tipo3;
    }

    public int tipoVivienda(){
        return tipo3;
    }
    
}
