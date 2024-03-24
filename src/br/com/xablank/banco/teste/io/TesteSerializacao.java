package br.com.xablank.banco.teste.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.xablank.banco.modelo.Cliente;
import br.com.xablank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException{

		Cliente cliente = new Cliente();
		
		cliente.setCpf("132730");
		cliente.setNome("Biné");
		cliente.setProfissao("tocador de berimbau");
		
		ContaCorrente cc = new ContaCorrente(12,14);
		cc.setTitular(cliente);
		cc.deposita(300.50);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();
		

	}

}
