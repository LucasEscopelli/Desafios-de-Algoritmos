package fundamentos;

public class Interferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5; //aqui a variavel a foi DEFINIDA como double, não aceita mais qualquer tipo diferente
		System.out.println(a);
		
		var b = 4.5; //aqui a variavel b foi DEFINIDA como double, não aceita mais qualquer tipo diferente
		System.out.println(b);
		
		var c = "Texto"; //aqui a variavel c foi DEFINIDA como string, não aceita mais qualquer tipo diferente
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
//		var d; //aqui não funciona o tipo var pois a variável não foi inicializada, ou seja, não atribui à ela um valor assim que declarei-a
//		d = 5.98;
		
		
	}
	
	
}
