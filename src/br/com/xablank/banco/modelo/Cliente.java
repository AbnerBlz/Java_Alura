package br.com.xablank.banco.modelo;

import java.io.Serializable;

/**
 * Classe molde para constru��o de cliente (�bvio).
 * 
 * @author Abner
 * @version 1.0
 */


public class Cliente implements Serializable{
	private String nome;
	private String cpf;
	private String profissao;
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return this.profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}
