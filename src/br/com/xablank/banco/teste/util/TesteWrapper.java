package br.com.xablank.banco.teste.util;

public class TesteWrapper {

	public static void main(String[] args) {
		
		Integer numero = Integer.valueOf(50); //autoboxing
		Integer num = 23; //autoboxing
		
		num.intValue();//unboxing

		String eh = new String("23");
		System.out.println(Integer.parseInt(eh));//parsing para primitivo.
		System.out.println(Integer.valueOf(eh));//parsing para referência.
		
		//vale notar que há possibilidade de chamar métodos estáticos
		//diretamente da classe, como foi feito acima.
	
	}

}
