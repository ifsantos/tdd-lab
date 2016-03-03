package com.blogspot.ifsantos.calculadora;

public class ExcecaoAritmetica extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ExcecaoAritmetica() {
	}

	public ExcecaoAritmetica(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ExcecaoAritmetica(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ExcecaoAritmetica(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	
}
