package classe;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ProdutoTeste {
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		
		int d = JOptionPane.showConfirmDialog(null, "hoje eh natal?", "Selecione", JOptionPane.YES_NO_OPTION);
		
		Produto p1 = new Produto();
		System.out.println("qual o nome do produto?");
		p1.nome = c.next();
		System.out.println("qual o preco do produto?");
		p1.preco = c.nextDouble();
		
		
		
		double precoFinal1 = p1.precoComDesconto(d);

		
		System.out.println(precoFinal1);
		
		c.close();
	}
}
