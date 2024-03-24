package test;


public class TestaBanco {
	public static void main(String[] args) {
		Cliente clienteJ = new Cliente();
		clienteJ.setNome("jubileu");
		clienteJ.setCpf("12");
		clienteJ.profissao = "vendedor de crack";
				
		Conta contaJubileu = new Conta();
		contaJubileu.deposita(600);
		
		contaJubileu.titular = clienteJ;
		
		System.err.println(clienteJ.nome);
	}
}
