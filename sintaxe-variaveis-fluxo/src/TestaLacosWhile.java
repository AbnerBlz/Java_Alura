
public class TestaLacosWhile {
	public static void main(String[] args) {
		int multiplicador = 0;

		while (multiplicador < 10) {
			multiplicador++;
			int contador = 0;
			while (contador < 10) {
				contador++;
				System.out.print(multiplicador * contador + " ");
			}
			System.out.println();
		}

	}

}
