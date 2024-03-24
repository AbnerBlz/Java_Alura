
public class TesteReferencias {
	public static void main(String[] args) {
		Gerente osvaldo = new Gerente();
		osvaldo.setNome("Osvaldo");
		String nome = osvaldo.getNome();
		
		System.out.println(nome);
		osvaldo.setSalario(3000);
		
			
		EditorVideo nerd = new EditorVideo();
		nerd.setSalario(1200);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(osvaldo);
		controle.registra(nerd);
		System.out.println(controle.getSoma());
		
		
	}
}
