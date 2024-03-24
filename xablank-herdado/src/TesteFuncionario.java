
public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario jubileu = new Gerente();
		jubileu.setNome("Jubileu");
		jubileu.setCpf("14256124");
		jubileu.setSalario(6660.00);
		
		System.out.println(jubileu.getNome());
		System.out.println(jubileu.getBonificacao());
	}

}
