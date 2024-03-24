package test;



public class Conta {
		private double saldo;
		int agencia;
		int numero;
		private Cliente titular;
		
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
		public double extrato() {
			return saldo;
		}
		public Cliente getTitular() {
			return titular;
		}
		public void setTitular(Cliente titular) {
			this.titular = titular;
		}
	}

