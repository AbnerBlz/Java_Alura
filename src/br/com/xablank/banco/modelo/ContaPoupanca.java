package br.com.xablank.banco.modelo;

public class ContaPoupanca extends Conta {

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public String toString() {
		return "Conta poupanca, " + super.toString();
	}
}
