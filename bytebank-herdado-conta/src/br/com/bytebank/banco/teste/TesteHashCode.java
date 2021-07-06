package br.com.bytebank.banco.teste;

import java.util.HashMap;

import br.com.bytebank.banco.modelo.Cliente;

public class TesteHashCode {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Natalia","9999999999","Desenvolvedora");
		Cliente cliente2 = new Cliente("Tiago", "1234567", "Design");
		Cliente cliente3 = new Cliente("Caio", "76543221", "Arquiteto");
		
		HashMap<Cliente,String> hash = new HashMap<Cliente,String>();
		
		hash.put(cliente, "Info importante sobre Natalia");
		hash.put(cliente2, "Info importante sobr Tiago");
		hash.put(cliente3, "Info importante sobr Caio");
		
		//Criaremos outro cliente
		Cliente cliente4 = new Cliente("Felipe","123123123","Gerente");
		
		/*Aqui ele compara o valor que ele tem com um algum valor dos
		dos que já estão cadastrados
		*/
		System.out.println(hash.containsKey(cliente)); // False

		Cliente cliente5 = new Cliente("Livia", "54545432","Coordenadora");
		
		String info = hash.get(cliente3); // retornará o valor atribuído ao objeto no Mapa
		System.out.println(info);
		
		info = hash.get(cliente2);
		System.out.println(info);

		//System.out.println(cliente.hashCode());

	}

}
