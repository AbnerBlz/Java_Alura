
public class TesteConexao {
	public static void main(String[] args) {
		
		try(Conexao con = new Conexao()){
			con.leDados();
		}catch (IllegalStateException ex) {
			System.out.println("deu ruim");
		}
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		}catch(IllegalStateException ex) {
//			System.out.println("deu ruim");
//		}finally {
//			con.close();
//		}
	}
}
