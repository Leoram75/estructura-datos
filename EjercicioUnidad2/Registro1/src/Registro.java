public abstract class Registro {

    private String tipo;

    public Registro(String tipo){
        this.tipo = tipo;
    }

    public abstract int tipoVivienda();

    public String getTipo(){
        return tipo;
    }
    
}
