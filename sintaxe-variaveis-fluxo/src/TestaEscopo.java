
public class TestaEscopo {
	public static void main(String[] args) {
		int idade = 18;
		int quantidadePessoas = 1;
		boolean acompanhado;
		if (quantidadePessoas>=2) {
			 acompanhado = true;
		}else {
			 acompanhado=false;
		}
		if (idade >= 18 && acompanhado) {
			System.out.println("libera");
		} else {
			System.out.println("bloqueia");
			}
		}
	}

