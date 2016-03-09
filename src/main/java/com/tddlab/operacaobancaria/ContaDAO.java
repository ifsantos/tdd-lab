package com.tddlab.operacaobancaria;

public interface ContaDAO {

	Conta consultaConta(int numConta);
	
	void salvaConta(Conta c);
}
