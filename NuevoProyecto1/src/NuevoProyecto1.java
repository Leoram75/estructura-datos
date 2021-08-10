public class NuevoProyecto1 {

    // Atributos

    private double monto;
    private double interes;
    private double interesSimple;
    private double interesCompuesto;
    private double compararInversion;
    private int periodo;
    private double pMonto;
    private double pInteres;
    private int pPeriodo;
    private double calcularInteresSimple;
    private double calcularInteresCompuesto;

    // Metodos

    public NuevoProyecto1() {
    }

    public NuevoProyecto1(double monto, double interes, double interesSimple, double interesCompuesto,
            double compararInversion, int periodo, double pMonto, double pInteres, int pPeriodo) {
        this.monto = monto;
        this.interes = interes;
        this.interesSimple = interesSimple;
        this.interesCompuesto = interesCompuesto;
        this.compararInversion = compararInversion;
        this.periodo = periodo;
        this.calcularInteresSimple = interesSimple;
        this.calcularInteresCompuesto = interesCompuesto;
        this.pMonto = pMonto;
        this.pInteres = pInteres;
        this.pPeriodo = pPeriodo;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto=monto;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes=interes;
    }

    public Double getInteresSimple() {
        return interesSimple;
    }    

    public void setInteresSimple(Double interesSimple) {
        this.interesSimple=interesSimple;
    }

    public Double getInteresCompuesto() {
        return interesCompuesto;
    }    

    public void setInteresCompuesto(Double interesCompuesto) {
        this.interesCompuesto=interesCompuesto;
    }

    public Double getCompararInversion() {
        return compararInversion;
    }    

    public void setCompararInversion(Double compararInversion) {
        this.compararInversion=compararInversion;
    }

    public int getPeriodo() {
        return periodo;
    }    

    public void setPeriodo(int periodo) {
        this.periodo=periodo;
    }

    public int getpPeriodo() {
        return pPeriodo;
    }

    public void setpPeriodo(int pPeriodo) {
        this.pPeriodo=pPeriodo;
    }

    public Double getpMonto() {
        return pMonto;
    }

    public void setpMonto(Double pMonto) {
        this.pMonto=pMonto;
    }

    public Double getpInteres() {
        return pInteres;
    }

    public void setpInteres(Double pInteres) {
        this.pInteres=pInteres;
    }

  

    public double calcularInteresSimple() {

        double interesSimple = this.pMonto * (this.pInteres / 100) * this.pPeriodo;
        return Math.round(interesSimple);

    }

    
    public double calcularInteresCompuesto() {

        double interesCompuesto = this.pMonto * (Math.pow((1 + (this.pInteres / 100)), this.pPeriodo) - 1);
        return Math.round(interesCompuesto);

    }

    /*public String compararInversion(int pPeriodo, double pMonto, double pInteres) {

        pPeriodo = 0;
        pMonto = 0;
        pInteres = 0;
        return Math.round(compararInversion);        
    }*/
    
    public double compararInversion(int pPeriodo, double pMonto, double pInteres) {

        double compararInversion = calcularInteresCompuesto() - calcularInteresSimple();
        return Math.round(compararInversion);        
    }

    

}
