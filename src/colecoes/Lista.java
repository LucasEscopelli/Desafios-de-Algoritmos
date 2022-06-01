package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Joao"));
		lista.add(new Usuario("Claudia"));
		lista.add(new Usuario("Bia"));
		
		System.out.println(lista.get(3));
		System.out.println(lista.remove(1));
		System.out.println("removeu?" + lista.remove(new Usuario("Ana")));
		
		System.out.println("tem?" + lista.contains(new Usuario("Bia")));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
			
		}
		
	}
}
