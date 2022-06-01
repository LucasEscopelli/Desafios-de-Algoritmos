package oo.composicao.desafio;

public class ClienteTeste {
	public static void main(String[] args) {
		Produto produto1 = new Produto("Caneta", 2.50);
		Produto produto2 = new Produto("Caderno", 17.89);
		Produto produto3 = new Produto("lápis", 1.00);
		
		Compra compra1 = new Compra();
		Compra compra2 = new Compra();
		Compra compra3 = new Compra();
		
		Cliente cliente1 = new Cliente("Joao");
		Cliente cliente2 = new Cliente("Pedro");
		
		compra1.adicionarItem(4, produto1);
		compra1.adicionarItem(5, produto2);
		compra1.adicionarItem("borracha", 3, 2.50);
		compra1.obterValorTotal();
		
		
		compra2.adicionarItem(3, produto3);
		compra2.obterValorTotal();
		
		compra3.adicionarItem(5, produto3);
		
		cliente1.AdicionarCompra(compra1);
		cliente1.AdicionarCompra(compra2);
		
		cliente2.AdicionarCompra(compra3);

		

		
		System.out.println("O cliente " + cliente1.nome + " vai pagar "+ cliente1.obterValorTotal());
		System.out.println("O cliente " + cliente2.nome + " vai pagar "+ cliente2.obterValorTotal());

		
		
		
		
		
		
	}
}
