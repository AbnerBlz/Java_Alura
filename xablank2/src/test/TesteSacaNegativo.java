package test;

public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta contaFdp = new Conta();
		contaFdp.deposita(100);
		contaFdp.saca(101);
		System.out.println(contaFdp.extrato());
	}
}
