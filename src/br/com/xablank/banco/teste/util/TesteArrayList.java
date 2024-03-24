package br.com.xablank.banco.teste.util;

import java.util.ArrayList;
import java.util.LinkedList;

import br.com.xablank.banco.modelo.Conta;
import br.com.xablank.banco.modelo.ContaCorrente;
import br.com.xablank.banco.modelo.ContaPoupanca;

public class TesteArrayList {

	public static void main(String[] args) {
		
		ArrayList <Conta> listinha = new ArrayList<Conta>();
		
		ContaPoupanca cp = new ContaPoupanca(12, 1);
		listinha.add(cp);
		
		ContaPoupanca cp2 = new ContaPoupanca(12, 2);
		listinha.add(cp2);
		
		System.out.println("tamanho: " + listinha.size());
		System.out.println(listinha.get(1));
		
		//criação de uma referência por que Niquinho quis assim
		//para reenforçar cast type.(antes de implementar <Conta>)
		Conta ref = listinha.get(0);
		listinha.remove(1);
		//System.out.println(listinha.get(1));
		System.out.println("tamanho: " + listinha.size());
		//uso da referência para chamada de método da classe guardada.
		System.out.println("número: " + ref.getNumero());
		
		ContaCorrente cc = new ContaCorrente(20,10);
		listinha.add(cc);
		
		ContaCorrente cc2 = new ContaCorrente(20,16);
		listinha.add(cc2);
		
		for (int i = 0; i < listinha.size(); i++) {
			Conta oRef = listinha.get(i);
			System.out.println(oRef);
		}
		System.out.println("----------");
		//enhanced for, foreach, mesmo funcionamento do for, porém mais compacto/simples.
		for(Conta o : listinha) {
			System.out.println(o);
			
		}
		
	}
}
