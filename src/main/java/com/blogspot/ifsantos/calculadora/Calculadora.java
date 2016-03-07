package com.blogspot.ifsantos.calculadora;

public class Calculadora {

	public Double somar(Double a, Double b){
		if (b == null){
			return a;
		}
		if (a == null){
			return b;
		}
		
		if (isMax(a) || isMax(b))
			throw new ExcecaoAritmetica("problema na soma");
		
		return a+b;
		
	}
	private boolean isMax(Double a) {
		return a.compareTo(Double.MAX_VALUE)==0;
	}
	private boolean isMin(Double a) {
		return a.compareTo(Double.MIN_VALUE)==0;
	}
	public Double subtrair(Double a, Double b){
		if (b == null){
			return a;
		}
		if (a == null){
			return b;
		}
		if (a < 0 && isMax(b))
			throw new ExcecaoAritmetica("problema na soma");
		
		if (isMin(a) && b>0)
			throw new ExcecaoAritmetica("problema na soma");
		
		return a-b;
		
	}
	public Double multiplicar(Double a, Double b){
		if (b == null){
			return a;
		}
		if (a == null){
			return b;
		}
		if (isMax(a) || isMax(b))
			throw new ExcecaoAritmetica("problema na soma");
		
		if (isMin(a) || isMin(b))
			throw new ExcecaoAritmetica("problema na soma");
		
		return a*b;
		
	}
	public Double dividir(Double a, Double b){
		if (a == null){
			return null;
		}
		if (b == null){
			return a;
		}
		return a/b;
		
	}
	
}
