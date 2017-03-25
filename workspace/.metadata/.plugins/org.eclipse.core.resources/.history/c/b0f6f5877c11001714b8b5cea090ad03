package testes;

import org.junit.Assert;
import org.junit.Test;

import entidades.Servico;


public class ValorDescritivoTest {
	
	@Test
	public void validaParTest() {
		Servico servico = new Servico();
		
		Assert.assertEquals("ZERO", servico.validaValorDescritivo(0.0));
		Assert.assertEquals("DEZ", servico.validaValorDescritivo(10.0));
		Assert.assertEquals("VINTE", servico.validaValorDescritivo(20.0));
	}


}
