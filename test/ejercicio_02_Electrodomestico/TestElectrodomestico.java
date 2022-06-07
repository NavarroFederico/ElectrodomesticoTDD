package ejercicio_02_Electrodomestico;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestElectrodomestico {

	@Test
	public void queTengoUnElectrodomesticoConCaracteristicasEspecificas() {
		Double precio = 1000d;
		String color = "naranja";
		Character consumoEnergetico = 'A';
		Double peso = 10.0;
		Electrodomestico electro = cuandoCreoUnElectrodomesticoEspecifico(precio, color, consumoEnergetico, peso);
		entoncesTengoUnElectrodomestico(electro);
	}

//	Método comprobarConsumoEnergetico(char letra): comprueba que la letra
//	es correcta, sino es correcta usara la letra F por defecto. Este método se debe
//	invocar al crear el objeto y no será visible
//Rango Correcto entre A-F
//	@Test
//	public void queSeCompruebeSiLaLetraDelConsumoEsCorrectaSiNoLoEsQueSeaFPorDefecto() {
//		Electrodomestico electro = dadoQueTengoUnElectrodomestico();
//		cuandoCompruboElConsumoEnergetico(electro, 'L');
//		entoncesSuConsumoEnergeticoEs(electro, 'F');
//	}

	@Test
	public void queAlCrearUnObjetoSeComprubeSiLaLetraDelConsumoEstaPorFueraDelRangooSiLoEsta_F_PorDefecto() {
		Electrodomestico electro = cuandoCreoUnElectrodomesticoEspecifico(1000.0, "naranja", 'L', 10.0);
		entoncesSuConsumoEnergeticoEs(electro, 'F');
	}

//	Método comprobarColor(String color): comprueba que el color es correcto, y
//	si no lo es, usa el color blanco por defecto. Los colores disponibles para los
//	electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
//	está en mayúsculas o en minúsculas. Este método se invocará al crear el
//	objeto y no será visible

//	@Test
//	public void queSeCompruebeSeCompruebeElColorSinoEsCorrectoQueSea_blanco_PorDefecto() {
//		Electrodomestico electro = dadoQueTengoUnElectrodomestico();
//		cuandoComprueboSuColor(electro, "Naranja");
//		entoncesSuColorEs(electro, "blanco");
//	}

	@Test
	public void queAlCrearUnObjetoSeCompruebeSiElColorNoEsCorrectoQueSea_Blanco_PorDefecto() {
		Electrodomestico electro = cuandoCreoUnElectrodomesticoEspecifico(300.0, "violeta", 'A', 20.0);
		entoncesSuColorEs(electro, "blanco");

	}

	/*
	 * Metodo crearElectrodomestico(): le pide la información al usuario y llena el
	 * electrodoméstico, también llama los métodos para comprobar el color y el
	 * consumo. Al precio se le da un valor base de $1000.
	 */
	/*
	 * @Test public void
	 * queAlCrearUnElectrodomesticoIngresandoLosDatosPorTecladoSeCompruebeColorConsumoYPrecioBase1000
	 * () { Electrodomestico electro = dadoQueTengoUnElectrodomestico();
	 * cuandoCreoUnElectromesticoConIngresoDeTeclado(electro);
	 * entoncesSuColorEs(electro, "blanco"); entoncesSuConsumoEnergeticoEs(electro,
	 * 'F'); entoncesSuPesoEs(electro, 10.0); entoncesSuPrecioEs(electro, 1000.0);
	 * 
	 * }
	 */
	/*
	 * • Método precioFinal(): según el consumo energético y su tamaño, aumentará el
	 * valor del precio. Esta es la lista de precios:
	 */

	@Test
	public void queAlCalcularElPrecioFinalDelProductoSeCorrespondaConElAumentoPorCaracteristicas() {
		Electrodomestico electro = cuandoCreoUnElectrodomesticoEspecifico(0.0, "violeta", 'z', 10.0);
		cuandoCalculoPrecioFinal(electro);
		Double precioFinalEsperado = 1200.0;
		entoncesSuPrecioEs(electro, precioFinalEsperado);
	}

	/*
	 * Tengo lavadora con Un Atributo carga
	 */
	@Test
	public void queTengoUnaLavadoraConUnaCargaEspecifica() {
		Double cargaEspecifica = 30.0;
		Electrodomestico lavadora = cuandoCreoUnaLavadora(cargaEspecifica);
		entoncesSuCargaEs(lavadora, cargaEspecifica);
	}

	@Test
	public void queTengoUnaLavadoraIngresandoLosDatosPorTeclado() {
		Double cargaEspecifica = 30.0;
		Lavadora lavadora = dadoQueTengoUnaLavadora();
		cuandoCreoUnaLavadoraPorTeclado(lavadora);
		entoncesSuCargaEs(lavadora, cargaEspecifica);
	}

	@Test
	public void queAlCalcularElPrecioFinalDeLaLavadoraSeCorrespondaConElAumentoPorCaracteristicas() {
		Lavadora lavadora = cuandoCreoUnaLavadoraEspecifica(0.0, "violeta", 'z', 10.0, 40.0);
		cuandoCalculoElPrecio(lavadora);
		entoncesSuPrecioEs(lavadora, 1700.0);
	}

	@Test
	public void queTengoUnaTVConResolucionYSintonizador() {
		Double resolucion = 14.0;
		Boolean tieneSintonizador = true;
		Electrodomestico televisor = cuandoCreoUnTelevisor(resolucion, tieneSintonizador);
		entoncesSuResolucionEs(televisor, resolucion);
		entoncesTieneSintonizador(televisor, tieneSintonizador);

	}
	
	@Test
	public void queAlCalcularElPrecioFinalDelTelevisorSeCorrespondaConElAumentoPorCaracteristicas() {
		Televisor televisor=cuandoCreoUnTelevisorEspecifico(99999999.0,"violeta",'b',90.0, 45.0, true);
		cuandoCalculoElPrecio(televisor);
		entoncesSuPrecioEs(televisor, 4140.0);
	}

	private void cuandoCalculoElPrecio(Televisor televisor) {
		televisor.calcularPrecioFinal();
	}

	private Televisor cuandoCreoUnTelevisorEspecifico(Double precio, String color, Character letraDeConsumo, Double peso, Double pulgadas,
			Boolean tieneSintonizador) {
		return new Televisor(precio, color, letraDeConsumo, peso, pulgadas, tieneSintonizador);
	}

	private void entoncesTieneSintonizador(Electrodomestico televisor, Boolean tieneSintonizador) {
		Assert.assertEquals(tieneSintonizador, ((Televisor) televisor).getTieneSintonizador());

	}

	private void entoncesSuResolucionEs(Electrodomestico televisor, Double resolucion) {
		Assert.assertEquals(resolucion, ((Televisor) televisor).getResolucion());

	}

	private Electrodomestico cuandoCreoUnTelevisor(Double resolucion, Boolean tieneSintonizador) {

		return new Televisor(resolucion, null, null, resolucion, resolucion, tieneSintonizador);
	}

	private void cuandoCalculoElPrecio(Lavadora lavadora) {
		lavadora.calcularPrecioFinal();
	}

	private Lavadora cuandoCreoUnaLavadoraEspecifica(Double precio, String color, Character letraDeConsumo, Double peso,
			Double carga) {

		return new Lavadora(precio, color, letraDeConsumo, peso, carga);
	}

	private void cuandoCreoUnaLavadoraPorTeclado(Electrodomestico lavadora) {
		lavadora.CrearUnElectrodomestico();
	}

	private Lavadora dadoQueTengoUnaLavadora() {
		return new Lavadora();
	}

	private void entoncesSuCargaEs(Electrodomestico lavadora, Double cargaEsperada) {
		Assert.assertEquals(cargaEsperada, ((Lavadora) lavadora).getCarga());
	}

	private Electrodomestico cuandoCreoUnaLavadora(Double cargaEspecifica) {

		return new Lavadora(0.0, null, null, 0.0, cargaEspecifica);
	}

	private void cuandoCalculoPrecioFinal(Electrodomestico electro) {
		electro.calcularPrecioFinal();
	}

	private void entoncesSuPrecioEs(Electrodomestico electro, Double precioEsperado) {
		Assert.assertEquals(precioEsperado, electro.getPrecio());
	}

	private void cuandoCreoUnElectromesticoConIngresoDeTeclado(Electrodomestico electro) {
		electro.CrearUnElectrodomestico();

	}

	private void entoncesSuPesoEs(Electrodomestico electro, Double pesoEsperado) {
		Assert.assertEquals((Double) pesoEsperado, electro.getPeso());

	}

	private void entoncesSuColorEs(Electrodomestico electro, String colorEsperado) {
		Assert.assertEquals(colorEsperado, electro.getColor());
	}

//	private void cuandoComprueboSuColor(Electrodomestico electro, String color) {
//		electro.comprobarColor(color);
//	}

	private void entoncesSuConsumoEnergeticoEs(Electrodomestico electro, Character letraEsperada) {
		Assert.assertEquals(letraEsperada, electro.getConsumoEnergetico());
	}

//	private void cuandoCompruboElConsumoEnergetico(Electrodomestico electro, Character letra) {
//		electro.comprobarConsumoEnergetico(letra);
//	}

	private void entoncesTengoUnElectrodomestico(Electrodomestico electro) {
		Assert.assertEquals((Double) 1000.0, electro.getPrecio());
		Assert.assertEquals("blanco", electro.getColor());
		Assert.assertEquals((Character) 'A', electro.getConsumoEnergetico());
		Assert.assertEquals((Double) 10.0, electro.getPeso());
	}

	private Electrodomestico dadoQueTengoUnElectrodomestico() {
		return new Electrodomestico();
	}

	private Electrodomestico cuandoCreoUnElectrodomesticoEspecifico(Double precio, String color,
			Character consumoEnergetico, Double peso) {
		return new Electrodomestico(precio, color, consumoEnergetico, peso);
	}

}
