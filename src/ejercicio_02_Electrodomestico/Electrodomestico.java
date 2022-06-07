package ejercicio_02_Electrodomestico;

import java.util.Scanner;

public class Electrodomestico {
	protected final Double PRECIO_BASE = 1000.0;
	protected Double precio;
	protected String color;
	protected Character consumoEnergetico;
	protected Double peso;

	public Electrodomestico(Double precio, String color, Character consumoEnergetico, Double peso) {
		this.precio = PRECIO_BASE;
		this.peso = peso;
		this.color = color;
		this.consumoEnergetico =  consumoEnergetico;
		comprobarColor(color);
		comprobarConsumoEnergetico(consumoEnergetico);
	}

	public Electrodomestico() {
		this.precio = PRECIO_BASE;
	}

	public void setPrecio(Double precio) {

		this.precio = precio;

	}

	public void setColor(String color) {
		comprobarColor(color);

	}

	public void setConsumoEnergetico(Character consumoEnergetico) {
		comprobarConsumoEnergetico(consumoEnergetico);
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getPrecio() {
		return this.precio;
	}

	public String getColor() {
		return this.color;
	}

	public Character getConsumoEnergetico() {
		return this.consumoEnergetico;
	}

	public Double getPeso() {
		return this.peso;
	}

	private void comprobarColor(String color2) {
		if (color != null) {
			switch (color2.toLowerCase()) {
			case "rojo":
			case "azul":
			case "gris":
			case "negro":
			case "blanco":
				this.color = color2.toLowerCase();
				break;

			default:
				this.color = "blanco";
				break;
			}
		} else {
			this.color = "blanco";
		}
	}

	private void comprobarConsumoEnergetico(Character letra) {
		// primera opcion
		/*
		 * if (consumoEnergetico != 'A' && consumoEnergetico != 'B' && consumoEnergetico
		 * != 'C' && consumoEnergetico != 'D' && consumoEnergetico != 'E') {
		 * this.consumoEnergetico = 'F'; } else { this.consumoEnergetico =
		 * consumoEnergetico; }
		 */
		// seMeOcurriDespues
		if(letra !=null) {
		switch (letra) {
		case 'A':
		case 'a':
		case 'B':
		case 'b':
		case 'C':
		case 'c':
		case 'D':
		case 'd':
		case 'E':
		case 'e':
		case 'F':
		case 'f':
			this.consumoEnergetico = letra;
			break;
		default:
			this.consumoEnergetico = 'F';
			
		}
		}else {
			this.consumoEnergetico= 'F';
		}

	}

	public void CrearUnElectrodomestico() {
		Scanner leer = new Scanner(System.in);

		System.out.println("Ingrese un color");
		setColor(leer.next());
		System.out.println("Ingrese el consumo ");
		setConsumoEnergetico(leer.next().toUpperCase().charAt(0));
		System.out.println("Ingrese el peso del electrodomestico");
		setPeso(leer.nextDouble());

	}

	public void calcularPrecioFinal() {
		
		switch (this.consumoEnergetico) {
		case 'A':
		case 'a':
			this.precio += 1000.0;
			break;
		case 'B':
		case 'b':
			this.precio += 800.0;
			break;
		case 'C':
		case 'c':
			this.precio += 600.0;
			break;
		case 'D':
		case 'd':
			this.precio += 500.0;
			break;
		case 'E':
		case 'e':
			this.precio += 300.0;
			break;
		case 'F':
		case 'f':
			this.precio += 100.0;
			break;
		}

		if (this.peso >= 1 && this.peso <= 19) {
			this.precio += 100.0;
		} else if (this.peso >= 20 && this.peso <= 49) {
			this.precio += 500.0;

		} else if (this.peso >= 50 && this.peso <= 79) {
			this.precio += 800.0;

		} else if (this.peso >= 80) {
			this.precio += 1000.0;
		} else {
			this.precio += 0;
		}
	}
}
