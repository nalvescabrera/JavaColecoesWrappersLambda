package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {

		int[] idades = new int[5];
		String[] nomes = new String[5];
		
		/*Java ajuda no caso transforma do primitivo para um Objeto
		mais conhecido como Autoboxing */
		int idade = 29;//Integer
		Integer idadeRef = Integer.valueOf(29);//Autoboxing
		System.out.println(idadeRef.doubleValue());
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.BYTES);
		int valor = idadeRef.intValue();//Unboxing
		
		String s = args[0];
		
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.valueOf(s);
		System.out.println(numero);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29);
	}

}
