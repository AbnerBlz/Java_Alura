package br.com.xablank.banco.modelo;
//classe adaptadora para arrays, método alternativo a escrita padrão de arrays.
public class GuardaObjetos {
	private Object[] referencias;
	private int posicaoLivre;
	
	//método construtor desnecessário, visto que poderia ser instanciado o array
	//diretamente dos atributos, e o atributo posicaLivre já iria inicializar
	//com valor padrão, que é 0.
	public GuardaObjetos() {
		this.referencias = new Object[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Object o) {
		referencias[this.posicaoLivre] = o;
		this.posicaoLivre++;
	}
	
	public Object getReferencia(int x){
		return referencias[x];
	}
	
	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}
}
