
public class TestaGetSet {
	public static void main(String[] args) {
		Conta conta = new Conta (1552, 1341412);
		//conta.setNumero(4202);
		System.out.println(conta.getNumero());
		//conta.setAgencia(666);
		System.out.println(conta.getAgencia());
		
		Cliente Jubileu = new Cliente();
		conta.setTitular(Jubileu);
		
		Jubileu.setNome("Jubileu");
		Jubileu.setProfissao("putinha do papai");
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setCpf("13241986");
		System.out.println(conta.getTitular().getCpf());
		
		Conta conta2 = new Conta(123124,45215);
		Conta conta3= new Conta();
		System.out.println(Conta.getTotal());
		}
	
}
