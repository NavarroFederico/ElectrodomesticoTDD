package ejercicio_02_Electrodomestico;

import java.util.Scanner;

public class Televisor extends Electrodomestico {

	private Double resolucion;
	private Boolean tieneSintonizador;

	public Televisor(Double precio, String color, Character consumoEnergetico, Double peso, Double resolucion,
			Boolean tieneSintonizador) {
		super(precio, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.tieneSintonizador = tieneSintonizador;

	}

	public Televisor() {
		
	}

	public Double getResolucion() {
		return resolucion;
	}

	public void setResolucion(Double resolucion) {
		this.resolucion = resolucion;
	}

	public Boolean getTieneSintonizador() {
		return tieneSintonizador;
	}

	/**
	 * 
	 * @param tieneSintonizador
	 */
	public void setTieneSintonizador(Boolean tieneSintonizador) {
		this.tieneSintonizador = tieneSintonizador;
	}

	@Override
	public void CrearUnElectrodomestico() {
		System.out.println("Crear Televisor ");
		Scanner leer = new Scanner(System.in);
		super.CrearUnElectrodomestico();
		System.out.println("Ingrese la resolución del televisor");
		this.resolucion = leer.nextDouble();
		System.out.println("El televisor tiene sintonizador SI o NO");
		if (leer.next().equalsIgnoreCase("Si")) {
			this.tieneSintonizador = true;
		} else {
			this.tieneSintonizador = false;
		}

	}

	/**
	 * Si el televisor tiene una resolución mayor de 40 pulgadas, se incrementará el
	 * precio un 30% y si tiene un sintonizador TDT incorporado, aumentará $500.
	 * Recuerda que las condiciones que hemos visto en la clase Electrodomestico
	 * también deben afectar al precio
	 */

	@Override
	public void calcularPrecioFinal() {
		
		System.out.println(this.precio);
		super.calcularPrecioFinal();
		System.out.println(this.precio);
		if(this.resolucion>=40) {
			this.precio+=(this.precio*0.30);
	}
		
		if(this.tieneSintonizador==true) {
			this.precio+= 500.0;
		}
		System.out.println(this.precio);
}
}
