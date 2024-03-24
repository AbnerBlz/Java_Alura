package br.com.xablank.banco.modelo;
//classe adaptadora para arrays, m�todo alternativo a escrita padr�o de arrays.
public class GuardaContas {
	private Conta[] referencias;
	private int posicaoLivre;
	
	//m�todo construtor desnecess�rio, visto que poderia ser instanciado o array
	//diretamente dos atributos, e o atributo posicaLivre j� iria inicializar
	//com valor padr�o, que � 0.
	public GuardaContas() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Conta o) {
		referencias[this.posicaoLivre] = o;
		this.posicaoLivre++;
	}
	
	public Conta getReferencia(int x){
		return referencias[x];
	}
	
	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}
}
