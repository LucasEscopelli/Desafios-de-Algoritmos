package fundamentos.operadores;

public class DesafioArtimeticos {
	public static void main(String[] args) {
		double a = 3.3;
		double b = Math.pow(a, 3);
		
		System.out.println(b);
		
		double divid1 = Math.pow((6 * (3 + 2)), 2) / (3 * 2);
		
		double divid2 = Math.pow((1-5) * (2-7)/2, 2);	
		
		double divid = Math.pow(divid1 - divid2, 3);
		
		double resultado = divid / (Math.pow(10, 3));
		
		
		System.out.println(resultado);
				

	}
}
