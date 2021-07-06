package br.com.bytebank.banco.modelo;

public class GuardadorDesafio {

	private Object[] referencias;
	private int proximaPosicao;
	
	public GuardadorDesafio() {
		this.referencias = new Object[10];
		this.proximaPosicao = 0;
	}

	public Object[] getReferencias() {
		return referencias;
	}

	public void adicionaCliente(Cliente ref) {
		this.referencias[this.proximaPosicao] = ref;
		this.proximaPosicao++;		
	}
	
	public int getQuantidadeDeElementos() {
		return this.proximaPosicao;
	}

	public Object getReferencia(int pos) {
		return this.referencias[pos];
	}
	
	public Cliente[] getTodosElementos() {
		int tamanho = this.getQuantidadeDeElementos();
		for(int i = 0; i< tamanho;i++) {
			Object oRef = this.getReferencia(i);
			System.out.println(oRef);
		}
		 	return new Cliente[0];
	}
	
	
}
