package xablank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 20;
		conta.deposita(40);
		System.out.println(conta.saldo);
		boolean rolououN=conta.saca(20);
		System.out.println(conta.saldo);
		System.out.println(rolououN);
		
		Conta conta2 = new Conta();
		conta2.deposita(800);
		
		if(conta2.transfere(200, conta)) {
			System.out.println("deu boa");
		} else{
			System.out.println("não rolou");
		}
		System.out.println(conta2.saldo);
		System.out.println(conta.saldo);
	}
}
