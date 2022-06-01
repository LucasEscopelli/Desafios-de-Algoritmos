package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O Pequeno Principe");
		livros.push("Memorias Postumas");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek()); //boolean
		System.out.println(livros.element()); //excecao
		
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll()); //nulo
//		System.out.println(livros.remove()); //excecao
//		System.out.println(livros.pop()); //excecao
		
//		livros.size();
//		livros.clear();
//		livros.contains();
		
		for(String livro: livros) {
			System.out.println(livro);
		}
	}
	
}
