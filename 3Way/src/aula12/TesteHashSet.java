package aula12;
import java.util.HashSet;

import aula08.Cliente;

public class TesteHashSet {

	public static void main(String[] args) {
		
		HashSet<Cliente> clientes = new HashSet<Cliente>();
		clientes.add(new Cliente("Jesus"));
		//duplicado
		clientes.add(new Cliente("Jesus"));
		clientes.add(new Cliente("Mateus"));
		clientes.add(new Cliente("Maria"));
		//duplicado
		clientes.add(new Cliente("Paulo"));
		clientes.add(new Cliente("João"));
		
		System.out.println(clientes);
	}

}
