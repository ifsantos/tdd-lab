package com.blogspot.ifsantos.calculadora.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.blogspot.ifsantos.calculadora.Calculadora;

public class CalculadoraTest {

	static Calculadora c;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		c = new Calculadora();
	}

	@Test
	public void testSomarOk() {
		Float soma = c.somar(3f, 4f);
		assertTrue("soma deve ser 7", 7f == soma);
	}
	@Test
	public void testSomarOkDecimal() {
		Float soma = c.somar(3.33f, 4.44f);
		assertTrue("soma deve ser 7.77", 7.77f == soma);
	}
	@Test
	public void testSomarANull() {
		Float soma = c.somar(null, 4f);
		assertTrue("soma com A=null deve ser igual a B (4)", 4f == soma);
	}
	@Test
	public void testSomarBNull() {
		Float soma = c.somar(3f, null);
		assertTrue("soma com B=null deve ser igual a A (3)", 3f == soma);
	}
	@Test
	public void testSomarABNull() {
		Float soma = c.somar(null, null);
		assertNull("soma com A e B nulos deve ser null", soma);
	}
	@Test
	public void testSomarFracaoTendeAZero() {
		Float soma = c.somar(6f, 0.000001f);
		assertFalse("soma com Fracao deve ser diferente de soma com zero", 6f == soma);
		
	}

	@Test
	public void testSubtrair() {
		Double subtracao = c.subtrair(13d, 3d);
		assertEquals(0, Double.compare(subtracao, 10.0));
	}

	@Test
	public void testMultiplicar() {
		Double mult = c.multiplicar(2.0, 3.0);
		assertEquals(0, Double.compare(mult, 6.0));
	}

	@Test
	public void testDividirOk() {
		Double div = c.dividir(3.0, 2.0);
		System.out.println(div);
		assertTrue(0==Double.compare(1.5, div));
	}
	@Test
	public void testDividirInfinite() {
		Double div = c.dividir(2.0, 0.0);
		System.out.println(div);
		assertTrue(Double.isInfinite(div));
	}
	@Test
	public void testDividirNaN() {
		Double div = c.dividir(0.0, 0.0);
		System.out.println(div);
		assertTrue(Double.isNaN(div));
	}
	@Test
	public void testDividirANull() {
		Double div = c.dividir(null, 0.0);
		System.out.println(div);
		assertTrue(0 == div);
	}
	@Test
	public void testDividirBNull() {
		Double div = c.dividir(323d, null);
		System.out.println(div);
		assertTrue(323 == div);
	}
	@Test
	public void testDividirABNull() {
		Double div = c.dividir(null, null);
		System.out.println(div);
		assertNull(div);
	}

}

