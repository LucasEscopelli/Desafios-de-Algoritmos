package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	public static void main(String[] args) {
		
		double a = 1;  //implicita
		System.out.println(a);
		
		float b = (float) 1.0111111111111111; //explicita (CAST)
		System.out.println(b);
		
		double c = 300;
		byte d = (byte) c; //explícita (CAST)
		System.out.println(d); //aqui vai printar um valor diferente do digitado, pois a partir do momento que o numero passa o valor maximo, a diferença entre eles começa a somar com o range minimo
	
		double e = 1;
		int f = (int) e; //explícita (CAST)
		
	}
}
