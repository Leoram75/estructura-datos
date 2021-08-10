//import java.util.*;

public class NuevoProyecto {

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

    public NuevoProyecto() {
    }

    public NuevoProyecto(double monto, double interes, double interesSimple, double interesCompuesto,
            double compararInversion, int periodo, double pMonto, double pInteres, int pPeriodo) {
        this.monto = monto;
        this.interes = interes;
        this.interesSimple = interesSimple;
        this.interesCompuesto = interesCompuesto;
        this.compararInversion = compararInversion;
        this.periodo = periodo;
        this.calcularInteresSimple = interesSimple;
        this.calcularInteresCompuesto = interesCompuesto;
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
  

    public double calcularInteresSimple() {

        double interesSimple = this.monto * (this.interes / 100) * this.periodo;
        return Math.round(interesSimple);

    }

    
    public double calcularInteresCompuesto() {

        double interesCompuesto = this.monto * (Math.pow((1 + (this.interes / 100)), this.periodo) - 1);
        return Math.round(interesCompuesto);

    }

    public double compararInversion(int pPeriodo, double pMonto, double pInteres) {

        this.pMonto = pMonto;
        this.pInteres = pInteres;
        this.pPeriodo = pPeriodo;
        double diferencia = 0;
        diferencia = calcularInteresCompuesto() - calcularInteresSimple();
        return diferencia;
      
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

    public double compararInversion() {

        double compararInversion = interesCompuesto - interesSimple;
        return Math.round(compararInversion);
    }

    

}
