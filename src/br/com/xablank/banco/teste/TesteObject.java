package br.com.xablank.banco.teste;

import br.com.xablank.banco.modelo.ContaCorrente;
import br.com.xablank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		
		ContaPoupanca cp = new ContaPoupanca(21,42);
		ContaCorrente cc = new ContaCorrente(124, 52);
		
		System.out.println(cp);
		System.out.println(cc);
		
		cc.deposita(200);
		System.out.println(cc.extrato());
	}

}
