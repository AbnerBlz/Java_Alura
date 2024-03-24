package br.com.xablank.banco.teste;

import br.com.xablank.banco.modelo.Conta;
import br.com.xablank.banco.modelo.ContaCorrente;
import br.com.xablank.banco.modelo.ContaPoupanca;
import br.com.xablank.banco.modelo.Tributavel;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Tributavel[] trib = new Tributavel[2];
		Conta[] contas = new Conta[4];
		
		ContaCorrente cc1 = new ContaCorrente(12, 1);
		contas[0] = cc1;
		
		ContaPoupanca cp = new ContaPoupanca(12,2);
		contas[1] = cp;
		
		//cast de object (classe mais genérica) para CC, poderia ser Conta tb.
		System.out.println(((Conta) contas[0]).getNumero());
		
		ContaPoupanca ref = (ContaPoupanca) contas[1];
		System.out.println(ref.getNumero());
		
		
		System.out.println();
		System.out.println(contas.length);
		
		int[] nums = {1,2,4,8,16};
		System.out.println(nums.length);
		
		
		//teste, garantindo que também é possível criar array de interfaces,
		//que recebe classes que implementam a mesma.
		trib[1] = new ContaCorrente(1, 2);
		
		//forcando um ClassCastException, pois uso um cast que obriga CP
		//a atuar como CC:
		System.out.println(((ContaCorrente) contas[1]).getNumero());
	}
}
