package fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		System.out.println("mini desafio");
		System.out.println(++a == b--); //verdadeiro porque primeiro aumenta o a, depois faz a comparação e só depois diminui o b
		System.out.println(a == b); //falso pois os incrementos e subtrações já foram feitos
		System.out.println(a);
		System.out.println(b);
	}
}
