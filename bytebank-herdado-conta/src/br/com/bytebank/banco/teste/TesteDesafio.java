package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.GuardadorDesafio;

public class TesteDesafio {
	public static void main(String[] args) {

		GuardadorDesafio desafio = new GuardadorDesafio();

		Object c1 = new Cliente("Natalia", "123456789012", "Desenvolvedor");
		desafio.adicionaCliente((Cliente)c1);
		
		Object c2 = new Cliente("João", "123456789013", "Gerente");
		desafio.adicionaCliente((Cliente)c2);
		
		int tamanho = desafio.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Cliente ref = (Cliente)desafio.getReferencia(1);
		//System.out.println("Nome: " + ref.getNome() + " Profissão: " + ref.getProfissao());
		
		Cliente[] input = desafio.getTodosElementos();
		System.out.println(input);
	}	
}
