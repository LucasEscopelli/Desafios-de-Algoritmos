package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

	ArrayList<Item> itens = new ArrayList<>();
	

	void adicionarItem(String nome, int quant, double preco) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(quant, produto));
	}
	
	void adicionarItem(int quant, Produto p) {
		this.itens.add(new Item(quant, p));
	}
	
	double obterValorTotal() {
		double valorTotal = 0;
		
		for(Item item: itens) {
			valorTotal += item.quant * item.produto.preco;
		}
		
		return valorTotal;
	}
}
