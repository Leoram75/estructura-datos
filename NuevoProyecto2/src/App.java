public class App {
    public static void main(String[] args) {
		/*
		 * Ejecución 1:
		 * 
		 * En la primera ejecución o caso de prueba se invoca al constructor sin
		 * argumentos para que los valores de los atributos: -monto -interes; -periodo;
		 * sean 0 por esta razon al invocar a los métodos: calcularInteresSimple y
		 * calcularInteresCompuesto el resultado sera= 0
		 * 
		 * Cuando se invoca al método compararInversion(6, 10000000, 1.2), es importante
		 * asignar valores a los atributos -monto -interes; -periodo; para que el
		 * calculo se realice correctamente y devuelva el valor esperado: 21949.0
		 * 
		 * por esta razón lo primero que hace es asignar los valores recibidos como
		 * parametros a cada uno de los atributos(ver inicio del metodo
		 * compararInversion)
		 * 
		 * this.setPeriodo(pPeriodo); this.setMonto(pMonto); this.setInteres(pInteres);
		 */
		NuevoProyecto2 np = new NuevoProyecto2();
		System.out.println("Escenario 1");
		System.out.println("Interes simple: " + np.calcularInteresSimple());
		System.out.println("Interes Compuesto: " + np.calcularInteresCompuesto());
		System.out.println("Comparar Inversion: " + np.compararInversion(6, 10000000, 1.2));

		/*
		 * Ejecución 2:
		 * 
		 * En la segunda ejecución o caso de prueba se invoca al constructor con
		 * parámetros y por esta razón al invocar los métodos que calculan el interes
		 * simple y compuesto
		 */
		NuevoProyecto2 np2 = new NuevoProyecto2(6, 10000000, 1.2);

		System.out.println("\nEscenario 2");
		System.out.println("Interes simple: " + np2.calcularInteresSimple());
		System.out.println("Interes Compuesto: " + np2.calcularInteresCompuesto());
		System.out.println("Comparar Inversion: " + np2.compararInversion());
		System.exit(0);
	}
}