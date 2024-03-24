package br.com.xablank.banco.modelo;

public class SaldoInsuficienteException extends Exception{

	public SaldoInsuficienteException (String msg) {
		super(msg);
	}
}
