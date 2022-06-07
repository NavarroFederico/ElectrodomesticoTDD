package ejercicio_02_Electrodomestico.servicio;

import java.util.Scanner;

import ejercicio_02_Electrodomestico.Lavadora;
import ejercicio_02_Electrodomestico.Televisor;

public class ServicioElectrodomestico {
	Scanner leer = new Scanner(System.in);
	
	Lavadora crearUnaLavadora() {
		Lavadora nuevo= new Lavadora();
		System.out.println("***Crear Lavadora***");

		System.out.println("Ingrese un color");
		nuevo.setColor(leer.next());
		System.out.println("Ingrese el consumo ");
		nuevo.setConsumoEnergetico(leer.next().toUpperCase().charAt(0));
		System.out.println("Ingrese el peso del electrodomestico");
		nuevo.setPeso(leer.nextDouble());
		System.out.println("Ingrese la carga del lavadora");
		nuevo.setCarga(leer.nextDouble());
		return nuevo;
	}
	Televisor crearUnTelevisor() {
		Televisor nuevo= new Televisor();
		System.out.println("***Crear Televisor***");
		
		System.out.println("Ingrese un color");
		nuevo.setColor(leer.next());
		System.out.println("Ingrese el consumo ");
		nuevo.setConsumoEnergetico(leer.next().toUpperCase().charAt(0));
		System.out.println("Ingrese el peso del televisor");
		nuevo.setPeso(leer.nextDouble());
		System.out.println("Ingrese la resolución del televisor");
		nuevo.setResolucion( leer.nextDouble()); 
		System.out.println("El televisor tiene sintonizador SI o NO");
		if (leer.next().equalsIgnoreCase("Si")) {
			nuevo.setTieneSintonizador(true);
		} else {
			nuevo.setTieneSintonizador(true);
		}
		return nuevo;
	}

	

}
