package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana"); //essa forma de adicionar gera um erro caso a fila ja esteja cheia
		fila.offer("Bia"); //essa forma vai retornar um valor boolean antes de adicionar (dependendo do quao cheia esteja a fila)
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");

		System.out.println(fila.peek());//vai pegar sempre o prieiro valora, caso nao tenha valores, retorna nulo
		System.out.println(fila.peek());
		System.out.println();
		System.out.println(fila.element());//mesma coisa mas da erro se não tiverem valores
		System.out.println(fila.element());
		
		
		System.out.println(fila.poll());//retorna o primeiro elemento da fila ja removendo
		System.out.println(fila.poll());//aqui como ja removeu o antigo primeiro remove o antigo segundo, agora novo primeiro
		System.out.println(fila.poll());//por ai vai
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());//retorna nulo ate deus dara
		//SE EU USASSE UM fila.remove(); ISSO NAO TERIA PROBLEMA, MAS NAO RETORNARIA NULO NO FIM E SIM UMA EXCEÇÃO
		
//		fila.size();
//		fila.clear();
//		fila.isEmpty();
//		fila.contains();

		
	}
}
