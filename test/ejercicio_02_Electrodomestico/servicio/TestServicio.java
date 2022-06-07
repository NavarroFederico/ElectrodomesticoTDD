package ejercicio_02_Electrodomestico.servicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import ejercicio_02_Electrodomestico.Lavadora;
import ejercicio_02_Electrodomestico.Televisor;

class TestServicio {

	@Test
	public void queAlCrearUnaLavadoraSeCreeConClaseServicio() {
		ServicioElectrodomestico servicio = dadoQueTengoUnaClaseServicio();
		Lavadora lavadora = cuandoCreoUnaLavadoraDesdeServicio(servicio);
		entoncesTengoUnaLavadora(lavadora);
		
	}

	@Test
	public void queAlCrearUnTelevisorSeCreeConClaseServicio() {
		ServicioElectrodomestico servicio = dadoQueTengoUnaClaseServicio();
		Televisor televisor = cuandoCreoUnTelevisorDesdeServicio(servicio);
		entoncesTengoUnaLavadora(televisor);
	}
	
	


	private void entoncesTengoUnaLavadora(Televisor televisor) {
		Assert.assertNotNull(televisor);
	}

	private Televisor cuandoCreoUnTelevisorDesdeServicio(ServicioElectrodomestico servicio) {
		return servicio.crearUnTelevisor();
	}

	private void entoncesTengoUnaLavadora(Lavadora lavadora) {
		Assert.assertNotNull(lavadora);
	}

	private Lavadora cuandoCreoUnaLavadoraDesdeServicio(ServicioElectrodomestico servicio) {
		return servicio.crearUnaLavadora();
	}

	private ServicioElectrodomestico dadoQueTengoUnaClaseServicio() {
		return new ServicioElectrodomestico();
	}

}
