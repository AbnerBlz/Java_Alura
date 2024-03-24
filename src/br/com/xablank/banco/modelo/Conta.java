package br.com.xablank.banco.modelo;

import java.io.Serializable;

/**
 * Classe molde para criação de contas para o projeto Xablank.
 * 
 * @author Abner
 * @version 1.0
 */

public abstract class Conta implements Comparable<Conta>, Serializable {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta() {
		total++;
		System.out.println("total: " + total);

	}

	/**
	 * construtor com parâmetros.
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		// this();
		this.agencia = agencia;
		this.numero = numero;
	}

	// código desnecessário, apenas para prática do abstract.
	public abstract void deposita(double valor);

	/**
	 * valor a sacar deve ser menor ou igual o saldo da conta.
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException {
		if (valor > saldo) {
			throw new SaldoInsuficienteException("valor insuficiente, fodase");
		}
		saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}

	public double extrato() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}

	/*
	 * public void setNumero (int numero) { if(numero>0) { this.numero =
	 * numero;}else { return; } public void setAgencia(int agencia) { if(agencia>0)
	 * { this.agencia = agencia;} else { return; } } }
	 */
	public int getAgencia() {
		return this.agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
	
	public String toString() {
		return "número: " + this.numero + ", agência: " + this.agencia;
	}
	
//	public boolean equivaleNico(Conta c) {
//		if(this.agencia != c.agencia) {
//			return false;
//		}if(this.numero != c.numero){
//			return false;
//		}else {
//			return true;
//		}
//	}
	@Override
	public boolean equals(Object ref) {
		Conta c = (Conta) ref;
		
		if(this.agencia == c.agencia && this.numero == c.numero) {
			return true;
		}else return false;
	}
	@Override
	public int compareTo(Conta o) {
		return Double.compare(this.saldo,o.saldo);
	}

}
