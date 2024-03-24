
public class TestaCondicional {
	public static void main(String[] args) {
		int idade = 18;
		int quantidadePessoas = 1;
		if (idade >= 18) {
			System.out.println("maior");
		} else {
			if(quantidadePessoas >= 2) {
				System.out.println("menor, acompanhado");
			}else {
			System.out.println("menor");
			}
		}
	}

}
