package br.com.xablank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		String nome = "Bebo,ra,bo,asd";
		String otro = new String("otro");
//		int lenght = nome.length();
//		System.out.println(lenght);
		String novo = nome.replace('o', 'a');

		System.out.println(novo);

		String upper = nome.toUpperCase();
		System.out.println(upper);
		String lower = nome.toLowerCase();
		System.out.println(lower);

		char e = nome.charAt(1);
		System.out.println(e);

		int pos = nome.indexOf("eb");
		System.out.println(pos);

		String sub = nome.substring(2);
		System.out.println(sub);
		
		for (int i=0; i<nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		System.out.println(nome.split("e",0));
		
		StringBuilder cs = new StringBuilder();
		cs.append("dq");
		
		System.out.println(cs);
		
	}

}
