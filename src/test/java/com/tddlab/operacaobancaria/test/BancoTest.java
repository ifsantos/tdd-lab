package com.tddlab.operacaobancaria.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;



import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import com.tddlab.operacaobancaria.Banco;
import com.tddlab.operacaobancaria.Conta;
import com.tddlab.operacaobancaria.ContaDAO;

public class BancoTest {

	@Mock
	ContaDAO dao;
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
		Conta value = new Conta(123,0.0);
		when(dao.consultaConta(any(Integer.class))).thenReturn(value);
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void mustSalvarContaComSucesso() {
		
		Banco b = new Banco(dao);
		Double novoSaldo = b.depositar(123, 100.0);
		assertEquals(100.0, novoSaldo, 0.0);
		
	}

}
