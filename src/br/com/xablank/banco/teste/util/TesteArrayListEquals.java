package br.com.xablank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collection;

import br.com.xablank.banco.modelo.Conta;
import br.com.xablank.banco.modelo.ContaCorrente;
import br.com.xablank.banco.modelo.ContaPoupanca;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		ArrayList<Conta> listinha = new ArrayList<Conta>();

		ContaPoupanca cp = new ContaPoupanca(12, 1);
		listinha.add(cp);

		ContaPoupanca cp2 = new ContaPoupanca(12, 2);
		listinha.add(cp2);

		ContaCorrente cc = new ContaCorrente(20, 10);
		listinha.add(cc);

		ContaCorrente cc2 = new ContaCorrente(20, 10);
		//listinha.add(cc2);

//		boolean igual = cc.equals(cc2);
//		System.out.println(igual);
		
		System.out.println("-------------");
		System.out.println(listinha.contains(cc2));
		System.out.println("-------------");
		
		for (Conta o : listinha) {
			if (o.equals(cc2)) {
				System.out.println("positivo");
			}else {
				System.out.println("nope.");
			}
		}

		
	}
}
