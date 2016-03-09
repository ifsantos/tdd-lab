package com.tddlab.operacaobancaria;

import com.tddlab.calculadora.Calculadora;

public class Banco {

	ContaDAO dao;
	
	public Banco(ContaDAO dao2) {
		this.dao = dao2;
	}

	public Double depositar(int numConta, double d) {
		Conta conta = dao.consultaConta(numConta);
		Calculadora calc = new Calculadora();
		conta.setSaldo( calc.somar(d, conta.getSaldo()) );
		dao.salvaConta(conta);
		return conta.getSaldo();
	}

}
