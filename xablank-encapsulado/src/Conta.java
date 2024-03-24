

public class Conta {
		private double saldo;
		private int agencia;
		private int numero;
		private Cliente titular;
		private static int total;
		
		public Conta () {
			total++;
			System.out.println("total: "+ total);

		}
		public Conta(int agencia, int numero) {
			this();
			this.agencia = agencia;
			this.numero = numero;
		}
		
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
		public int getNumero() {
			return numero;
		}
		/*public void setNumero (int numero) {
			if(numero>0) {
			this.numero = numero;}else {
				return;
			}
			public void setAgencia(int agencia) {
			if(agencia>0) {
			this.agencia = agencia;}
			else {
				return;
			}
		}
		}*/
		public int getAgencia() {
			return this.agencia;
		}
		
		public Cliente getTitular() {
			return titular;
		}
		public void setTitular(Cliente titular) {
			this.titular = titular;
		}
		public static int getTotal() {
			return Conta.total;
		}
		
	}

