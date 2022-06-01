package fundamentos.operadores;

public class SwitchSemBreak {
	public static void main(String[] args) {
		//if(boolean)
		//for(boolean)
		//while(boolean)
		
		String faixa = "preta";
		
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("sei para ser faixa preta");
		
		case "marrom":
			System.out.println("sei para ser faixa marrom");
		
		case "roxa":
			System.out.println("sei para ser faixa roxa");
			
		case "verde":
			System.out.println("sei para ser faixa verde");
			
		case "laranja":
			System.out.println("sei para ser faixa laranja");
			
		case "vermelha":
			System.out.println("sei para ser faixa vermelha");
		
		case "amarela":
			System.out.println("sei para ser faixa amarela");
			
		}
		//SE NAO COLOCAR O BREAK, ACABA SENDO ACUMULATIVO, OU SEJA, EXECUTA TODOS OS ABAIXO DO QUE CONDIZ COM A IGUALDADE
	
	}
}
