package br.com.xablank.banco.teste;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {

		int[] idades = new int[4];
//		
//		idades[1]=20;
//		idades[0]=23;
//		
//		System.out.println(idades[2]);

		for (int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
			System.out.println(idades[i]);

		}
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		System.out.println();
		System.out.println(idades.length);
	}
}
