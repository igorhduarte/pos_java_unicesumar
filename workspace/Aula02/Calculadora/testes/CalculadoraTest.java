package testes;

import org.junit.Assert;
import org.junit.Test;

import entidades.Calculadora;


public class CalculadoraTest {

	@Test
	public void validaParTest() {
		Calculadora calculadora = new Calculadora();
		
		Assert.assertEquals("PAR", calculadora.validaSeValorEhPar(2));
		
	}
	
	@Test
	public void validaImparTest(){
		Calculadora calculadora = new Calculadora();
		Assert.assertEquals("IMPAR", calculadora.validaSeValorEhImpar(3));
	}
}
