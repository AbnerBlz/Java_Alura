
public class Cliente implements Autenticavel{

	private Autenticador aut;	
	
	public Cliente(){
		this.aut = new Autenticador ();
	}
	
	public boolean autentica(int senha) {
		return this.aut.autentica(senha);
	}
	

	@Override
	public void setSenha(int senha) {
		this.aut.setSenha(senha);
		
	}
	
}
