package br.com.xablank;

import br.com.xablank.banco.modelo.Conta;
import br.com.xablank.banco.modelo.ContaPoupanca;

public class TesteBiblioteca {
	public static void main(String[] args) {
		Conta conta = new ContaPoupanca(234,2345);
		conta.deposita(124.0);
	}

}
