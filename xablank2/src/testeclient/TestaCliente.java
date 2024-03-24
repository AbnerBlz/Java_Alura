package testeclient;

import test.*;

public class TestaCliente {
	public static void main(String[] args) {
		Conta contaDaJubisleia = new Conta();
		contaDaJubisleia.setTitular(new Cliente());
		//Cliente clienteJubisleia = new Cliente();
		//contaDaJubisleia.titular = clienteJubisleia;
		//clienteJubisleia.nome = "jubisleia";
		contaDaJubisleia.getTitular().setProfissao("cafetona");
		System.out.println(contaDaJubisleia.getTitular().getProfissao());
	}
	
}
