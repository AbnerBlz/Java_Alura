
public class TesteSistema {
	public static void main(String[] args) {
		Gerente gerso = new Gerente ();
		gerso.setSenha(1426);
		
		SistemaInterno sys = new SistemaInterno();
		sys.autentica(gerso);
		
		Administrador admin = new Administrador();
		admin.setSenha(1426);
		sys.autentica(admin);
		
		Cliente claudio = new Cliente();
		claudio.setSenha(1426);
		sys.autentica(claudio);
	}
}
