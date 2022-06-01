package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Joana");
		usuarios.put(20, "Pedro");
		usuarios.put(3, "Claudia");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println("//////////////////////");
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		System.out.println("//////////////////////");
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Roberto"));
		System.out.println("//////////////////////");
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro);
		}
		System.out.println("//////////////////////");
		
		System.out.println(usuarios.get(3));
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(20, "Pedro"));
		System.out.println("//////////////////////");
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		System.out.println("//////////////////////");
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		System.out.println("//////////////////////");
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ==> ");
			System.out.println(registro.getValue());
		}
		System.out.println("//////////////////////");
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro);
		}
		System.out.println("//////////////////////");
	}
}
