package ejercicio_02_Electrodomestico;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

	private Double carga;
	
	public Lavadora(Double precio, String color, Character letraDeConsumo, Double peso,Double cargaEspecifica ) {
		super(precio, color, letraDeConsumo, peso);
		this.carga=cargaEspecifica;
	}
	public Lavadora() {
		
	}
	public Double getCarga() {
		return this.carga;
	}
	public void setCarga(Double carga) {
		this.carga=carga;
		
	}
	@Override
	public void CrearUnElectrodomestico() {
		System.out.println("Crear Lavadora");
		Scanner leer = new Scanner(System.in);
		super.CrearUnElectrodomestico();
		System.out.println("Ingrese la carga del lavadora");
		setCarga(leer.nextDouble());
	}
	@Override
	public void calcularPrecioFinal() {
		super.calcularPrecioFinal();
		if(this.carga>=40) {
			this.precio+= 500d;
		}
	}
	
}
