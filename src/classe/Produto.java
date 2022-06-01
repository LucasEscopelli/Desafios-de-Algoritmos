package classe;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25;
	
	double precoComDesconto(int ehNatal) {
		
		if(ehNatal == 0){
			desconto = 0.30;
		}
		
		return preco * (1 - desconto);
	}
}
