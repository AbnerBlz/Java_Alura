package br.com.xablank.banco.modelo;

import java.io.Serializable;

public class ContaCorrente extends Conta implements Tributavel, Serializable{
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	public void deposita(double valor) {
		super.saldo += valor;
	}
	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorASacar = valor + 0.25;
		super.saca(valorASacar);
	}
	@Override
	public double getValorImposto() {
		 return super.saldo*0.1;
	}
	
	@Override
	public String toString() {
		return "Conta corrente, " + super.toString();
	}
	
}
