package xablank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 420;
		System.out.println(primeiraConta.saldo);
		
		//Conta segundaConta = new Conta();
		Conta segundaConta = primeiraConta;
        segundaConta.saldo = 50;
        System.out.println(segundaConta.saldo);
       
	}

}
