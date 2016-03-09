package com.tddlab.calculadora.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.tddlab.calculadora.Calculadora;
import com.tddlab.calculadora.ExcecaoAritmetica;

public class CalculadoraTest {

	static Calculadora c;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		c = new Calculadora();
	}

	@Test
	public void testSomarOk() {
		Double soma = c.somar(3.0, 4.0);
		assertEquals("soma deve ser 7", 7.0, soma, 0.0);
	}
	@Test
	public void testSomarOkDecimal() {
		Double soma = c.somar(3.33, 4.44);
		assertEquals("soma deve ser 7.77", 7.77, soma, 0.0000000000001);
	}
	@Test
	public void testSomarANull() {
		Double soma = c.somar(null, 4.0);
		assertEquals("soma com A=null deve ser igual a B (4)", 4.0, soma, 0.0);
	}
	@Test
	public void testSomarBNull() {
		Double soma = c.somar(3.0, null);
		assertEquals("soma com B=null deve ser igual a A (3)", 3.0, soma, 0.0);
	}
	@Test
	public void testSomarABNull() {
		Double soma = c.somar(null, null);
		assertNull("soma com A e B nulos deve ser null", soma);
	}
	@Test
	public void testSomarFracaoTendeAZero() {
		Double soma = c.somar(6.0, 0.00000000001);
		assertEquals("soma com Fracao deve ser diferente de soma com zero", 6.00000000001, soma.doubleValue(), 0.0);
	}
	@Test(expected=ExcecaoAritmetica.class)
	public void mustExceptionWhenSomarMoreThanMax() {
		Double ret = c.somar(Double.MAX_VALUE, 1.0);
		System.out.println(ret);
	}

	@Test
	public void testSubtrairOK() {
		Double subtracao = c.subtrair(13d, 3d);
		assertEquals("Resultado desta subtração deve ser 10.0",0, Double.compare(subtracao, 10.0));
	}
	@Test
	public void testSubtrairANull() {
		Double subtracao = c.subtrair(null, 3d);
		assertEquals("Quando A é nulo, retorno deve ser B",0, Double.compare(subtracao, 3.0));
	}
	@Test
	public void testSubtrairBNull() {
		Double subtracao = c.subtrair(13d, null);
		assertEquals("Quando B é nulo, retono deve ser A",0, Double.compare(subtracao, 13.0));
	}
	@Test
	public void testSubtrairABNull() {
		Double subtracao = c.subtrair(null, null);
		assertNull("Quando A e B sao nulos retorno deve ser nulo",subtracao);
	}
	
	@Test(expected=ExcecaoAritmetica.class)
	public void testSubtrairMinValue() {
		c.subtrair(Double.MIN_VALUE, 1d);
	}
	@Test(expected=ExcecaoAritmetica.class)
	public void mustExceptionWhenSubMaxFromNegative() {
		c.subtrair(-1.0, Double.MAX_VALUE);
	}

	@Test
	public void testMultiplicarOK() {
		Double mult = c.multiplicar(2.0, 3.0);
		assertEquals("Resultado desta multiplicação deve ser 6.0", 6.0, mult, 0.0);
	}
	
	@Test
	public void testMultiplicarANull() {
		Double mult = c.multiplicar(null, 3.0);
		assertEquals("Quando A é nulo, retorno deve ser B", 3.0, mult, 0.0);
	}
	@Test
	public void testMultiplicarBNull() {
		Double mult = c.multiplicar(2.0, null);
		assertEquals("Quando B é nulo, retorno deve ser A", 2.0, mult, 0.0);
	}
	@Test
	public void testMultiplicarABNull() {
		Double mult = c.multiplicar(null,null);
		assertNull("Quando A e B são nulos, retorno deve ser nulo", mult);
	}
	@Test(expected=ExcecaoAritmetica.class)
	public void testMultiplicarMaxValue() {
		c.multiplicar(Double.MAX_VALUE, 2.0);
	}
	@Test(expected=ExcecaoAritmetica.class)
	public void testMultiplicarAlgoPorMaxValue() {
		c.multiplicar(2.1, Double.MAX_VALUE);
	}

	@Test(expected=ExcecaoAritmetica.class)
	public void testMultiplicarMinValue() {
		c.multiplicar(Double.MIN_VALUE, 2.0);
	}
	@Test(expected=ExcecaoAritmetica.class)
	public void testMultiplicarAlgoPorMinValue() {
		c.multiplicar(1.1,Double.MIN_VALUE);
	}
	
	@Test
	public void testDividirOk() {
		Double div = c.dividir(3.0, 2.0);
		assertEquals("Dividir 3 por 2 deve ser 1.5", 1.5, div, 0);
	}
	@Test
	public void testDividirPorZero() {
		Double div = c.dividir(2.0, 0.0);
		assertTrue("Dividir zero deve ser infinito", Double.isInfinite(div));
	}
	@Test
	public void testDividirZeroPorZero() {
		Double div = c.dividir(0.0, 0.0);
		assertEquals("Dividir 0 por 0 deve ser NaN",Double.NaN,(div),0);
	}
	@Test
	public void testDividirANull() {
		Double div = c.dividir(null, 10.0);
		assertNull("Dividir nulo por algo, deve ser nulo",div);
	}
	@Test
	public void testDividirBNull() {
		Double div = c.dividir(323d, null);
		assertEquals("Dividir A por nulo deve ser A", 323, div, 0.0);
	}
	@Test
	public void testDividirABNull() {
		Double div = c.dividir(null, null);
		assertNull("Dividir nulo por nulo deve ser nulo",div);
	}
}

