package br.com.bytebank.banco.modelo;

public class Cliente {

	private String nome;
	private String cpf;
	private String profissao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Cliente(String nome, String cpf, String profissao) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;
	}

	public Cliente() {
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + ", CPF: " + this.cpf + " Profissão: " + this.profissao;
	}

//	@Override
//	public int hashCode() {
//		return this.nome.length() * 8;
//	}
//
//	public boolean equals(Object o) {
//		if ((o instanceof Cliente) && ((Cliente) o).getNome().equals(this.getNome())) {
//			return true;
//		} else
//			return false;
//	}

}
