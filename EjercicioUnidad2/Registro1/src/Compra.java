public class Compra extends Registro {

    private int tipo1;

    public Compra(String tipo, int tipo1){
        super(tipo);
        this.tipo1 = tipo1;
    }

    public int tipoVivienda(){
        return tipo1;
    }
    
}
