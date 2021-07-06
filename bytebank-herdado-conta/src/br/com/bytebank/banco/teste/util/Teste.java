package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {

		int[] idades = new int[5];
		String[] nomes = new String[5];
		
		/*Java ajuda no caso transforma do primitivo para um Objeto
		mais conhecido como Autoboxing */
		int idade = 29;//Integer
		
		Integer idadeRef = Integer.valueOf(29);//Autoboxing
		int valor = idadeRef.intValue();//Unboxing
				
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29);
				
		String s = args[0];
		Integer numero = Integer.valueOf(s);
		System.out.println(numero);
	}

}
