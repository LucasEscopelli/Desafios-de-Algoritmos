package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		String s = "Bom dia X";
		System.out.println(s);
		
		s = s.toUpperCase();
		System.out.println(s);

		s = s.replace("X", "Senhora");
		System.out.println(s);
		
		s = s.concat("!!!");
		System.out.println(s);
		
		System.out.println("Leo".toUpperCase());
		
		String x  = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		
		//Tipos primitivos não tem o operador "."
		//Tipos primitivos não tem atributos nem comprtamentos
	}
	
}
