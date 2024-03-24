package xablank;

public class Conta {
		double saldo;
		int agencia;
		int numero;
		String titular;
		
		public void deposita(double valor){
			saldo += valor;
		}
		public boolean saca(double valor){
			if(valor <= saldo) {
				saldo-=valor;
				return true;
			}else {
				return false;
			}
		}
		public boolean transfere(double valor, Conta destino) {
			if(valor<=saldo) {
				saca(valor);
				destino.saldo+=valor;
				return true;
			}else {
				return false;
			}
		}
	}

