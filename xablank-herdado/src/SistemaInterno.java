
public class SistemaInterno {
	
	private int senha = 1426;
	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if (autenticou == true) {
			System.out.println("deu boa");
			
		}else {
			System.out.println("deu ruim");
		}
	}

}
