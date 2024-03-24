
public class TestaLacosWhile2 {
	public static void main(String[] args) {
		int linha = 1;
		
		while (linha <= 10) {
			linha++;
		int coluna = 0;
			while (coluna < 10) {
				coluna++;
				if (coluna == linha) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

