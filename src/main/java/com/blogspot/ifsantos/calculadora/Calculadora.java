package com.blogspot.ifsantos.calculadora;

public class Calculadora {

	public Float somar(Float a, Float b){
		if (b == null){
			return a;
		}
		if (a == null){
			return b;
		}
		return a+b;
		
	}
	public Double subtrair(Double a, Double b){
		return a-b;
		
	}
	public Double multiplicar(Double a, Double b){
		return a*b;
		
	}
	public Double dividir(Double a, Double b){
		return a/b;
		
	}
	
}
