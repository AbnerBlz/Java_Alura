
public class Gerente extends Funcionario implements Autenticavel {

	private String login;
	private int senha;
	private Autenticador aut;

	public Gerente() {
		this.aut = new Autenticador();
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public double getBonificacao() {
		return super.getSalario();
	}

	public boolean autentica(String login, int senha) {
		if (this.login == login && this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public void setSenha(int senha) {
		this.aut.setSenha(senha);

	}

	public boolean autentica(int senha) {
		return this.aut.autentica(senha);

	}
}
