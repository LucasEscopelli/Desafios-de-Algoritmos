package lambdas;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.List;

public class Consumidor {
	public static void main(String[] args) {
		Consumer<Produto> imprimir = 
				p -> System.out.println(p.nome + "!!!");
		
		Produto p1 = new Produto("Caneta" , 12.4, 0.08);
		Produto p2 = new Produto("Note" , 2500.4, 0.08);
		Produto p3 = new Produto("Caderno" , 10.3, 0.08);
		Produto p4 = new Produto("Lapis" , 1.0, 0.08);
		Produto p5 = new Produto("Estojo" , 10.0, 0.08);
		
		imprimir.accept(p1);
		
		System.out.println();
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimir);
		System.out.println();
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
		
		
	}
}
