package com.tddlab.operacaobancaria;

public class Conta {
	private Double saldo;
	private int numConta;
	
	public Conta(int numConta, Double d) {
		this.numConta = numConta;
		this.saldo = d;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
}
