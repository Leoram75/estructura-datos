public class NuevoProyecto2 {
	// ----------------------------------------------------------------- //
	// Atributos
	// ----------------------------------------------------------------- //

	private double monto;
	private double interes;
	private int periodo;

	// ----------------------------------------------------------------- //
	// Métodos
	// ----------------------------------------------------------------- //
	// constructores
	// constructor por defecto
	public NuevoProyecto2() {
		this.monto = 0.0;
		this.interes = 0.0;
		this.periodo = 0;
	}

	// constructor con argumentos
	public NuevoProyecto2(int pPeriodo, double pMonto, double pInteres) {
		this.periodo = pPeriodo;
		this.monto = pMonto;
		this.interes = pInteres;
	}

	/**
	 * @return the monto
	 */
	public double getMonto() {
		return monto;
	}

	/**
	 * @param monto the monto to set
	 */
	public void setMonto(double monto) {
		this.monto = monto;
	}

	/**
	 * @return the interes
	 */
	public double getInteres() {
		return interes;
	}

	/**
	 * @param interes the interes to set
	 */
	public void setInteres(double interes) {
		this.interes = interes;
	}

	/**
	 * @return the periodo
	 */
	public int getPeriodo() {
		return periodo;
	}

	/**
	 * @param periodo the periodo to set
	 */
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	// calcularInteresSimple( )
	public double calcularInteresSimple() {
		double interesSimple = this.getMonto() * (this.getInteres() / 100) * this.getPeriodo();
		return Math.round(interesSimple);
	}

	// calcularInteresCompuesto ( )
	public double calcularInteresCompuesto() {
		double compararInversion = this.getMonto() * (Math.pow((1 + (this.getInteres() / 100)), this.getPeriodo()) - 1);
		return Math.round(compararInversion);
	}

	public double compararInversion(int pPeriodo, double pMonto, double pInteres) {
		// primero se asignan valores a cada uno de los atributos
		this.setPeriodo(pPeriodo);
		this.setMonto(pMonto);
		this.setInteres(pInteres);

		double compararInversion = calcularInteresCompuesto() - calcularInteresSimple();
		return Math.round(compararInversion);
	}

	public double compararInversion() {
		double compararInversion = calcularInteresCompuesto() - calcularInteresSimple();
		return Math.round(compararInversion);
	}
}