package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

public class TesteNewExemplo {

	public static void main(String[] args) {

		ArrayList lista = new ArrayList<>(26);
		lista.add("SP");
		lista.add("RJ");
		lista.add("MG");
		//outros estados
		
		ArrayList nova = new ArrayList(lista);
		
		System.out.println(nova);
	}

}
