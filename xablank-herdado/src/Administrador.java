
public class Administrador extends Funcionario implements Autenticavel{
	
	private Autenticador aut;
	
	public Administrador() {
		this.aut = new Autenticador();
	}
	
	@Override
	public double getBonificacao() {
		return 50;
		
	}

	
	public boolean autentica(int senha) {
		return this.aut.autentica(senha);
	}


	
	public void setSenha(int senha) {
		this.aut.setSenha(senha);
		
	}
}
