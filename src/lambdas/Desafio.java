package lambdas;

import java.text.DecimalFormat;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	DecimalFormat df = new DecimalFormat("0.00");
	public static void main(String[] args) {
		
		Produto p = new Produto("iPad" , 3235.89, 0.13);
		
		BinaryOperator<Double> precoDesc = (n, m) -> 
		{return n * (1 - m);};
		
		UnaryOperator<Double> imposto = 
				j -> (j >= 2500.0 ? (j * 1.085) : j);
				
		UnaryOperator<Double> frete = 
				x -> (x >= 3000.0 ? (x + 100.0) :  (x + 50.0));
				
		Function<Double, String> arredonda =
				o -> {DecimalFormat df = new DecimalFormat("#.##");
					return df.format(o);
					};
				
		Function<String, String> formata = 
				d -> {return ("o preco eh R$"+ d);};
				
		
				
		System.out.println(precoDesc.andThen(imposto).andThen(frete).andThen(arredonda).andThen(formata).apply(p.preco, p.desconto));
				
	}
}
