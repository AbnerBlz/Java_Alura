package br.com.xablank.banco.teste;

import br.com.xablank.banco.especial.ContaEspecial;
import br.com.xablank.banco.modelo.ContaCorrente;
import br.com.xablank.banco.modelo.ContaPoupanca;
import br.com.xablank.banco.modelo.SaldoInsuficienteException;
import br.com.xablank.banco.modelo.Cliente;

public class TestaConta {
	public static void main(String[] args) throws SaldoInsuficienteException {
		ContaCorrente  cc = new ContaCorrente(1,2412);
		cc.deposita(200);
		
		ContaPoupanca poupanca = new ContaPoupanca(1,2623);
		poupanca.deposita(300);
		
		try {
		poupanca.transfere(25, cc);
		}catch(SaldoInsuficienteException ex) {
			
		}
		System.out.println(cc.extrato());
		System.out.println(poupanca.extrato());
		
		try {
			cc.saca(265);
		}catch (SaldoInsuficienteException ex) {
			
		}
		
		System.out.println(cc.extrato());
		
		ContaEspecial coe = new ContaEspecial();
		coe.getSaldo();
		
		
		//teste revisão atribuição titular/cliente a uma conta
		
		coe.setTitular(new Cliente());
		coe.getTitular().setProfissao("agiota");
		coe.getTitular().setCpf("124415");
	}
	
}
