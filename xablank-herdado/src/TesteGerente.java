
public class TesteGerente {

	public static void main(String[] args) {
		
				SistemaInterno sy = new SistemaInterno();
		
		Gerente jubiloso = new Gerente();
		jubiloso.setNome("Jubilão");
		jubiloso.setCpf("2134215");
		jubiloso.setSalario(3000.0);

		System.out.println(jubiloso.getSalario());
		System.out.println(jubiloso.getNome());
		System.out.println(jubiloso.getCpf());
		
		jubiloso.setLogin("jusbilinho");
//		jubiloso.setSenha(685);
//
//		boolean verifica = jubiloso.autentica(685);

		//System.out.println(verifica);
		
		Cliente cli = new Cliente();
		cli.setSenha (1426);
		sy.autentica(cli);
		
		System.out.println(jubiloso.getBonificacao());
		
		}

}
