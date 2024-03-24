package br.com.xablank.banco.teste;

import br.com.xablank.banco.modelo.CalculadorDeImposto;
import br.com.xablank.banco.modelo.ContaCorrente;
import br.com.xablank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(124, 20);
		cc.deposita(1000);
		
		SeguroDeVida sdv = new SeguroDeVida();
		
		CalculadorDeImposto cdi = new CalculadorDeImposto();
		cdi.registra(cc);
		cdi.registra(sdv);
		
		System.out.println(cdi.getTotalImposto());
	}

}
