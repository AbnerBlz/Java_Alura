package br.com.xablank.banco.teste;

import br.com.xablank.banco.modelo.Conta;
import br.com.xablank.banco.modelo.ContaPoupanca;
import br.com.xablank.banco.modelo.GuardaContas;

public class TesteGuardaContas {

	public static void main(String[] args) {
		
		GuardaContas guarda =new GuardaContas();
		ContaPoupanca cp = new ContaPoupanca(12, 10);
		
		guarda.adiciona(cp);
		
		System.out.println(guarda.getReferencia(0));
		
		int tamanho = guarda.getQuantidadeDeElementos();
		
		System.out.println(tamanho);
		
		Conta ref = guarda.getReferencia(0);
		System.out.println(ref.getNumero());
	}

}
