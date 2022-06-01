package fundamentos.operadores;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		String palavra;
		Scanner c = new Scanner(System.in);
		
		System.out.println("digite a sua palavra");
		palavra = c.next();
		
		int i = 0;
		for(; i < palavra.length() ; i++) {
			System.out.printf("%c ", palavra.charAt(i));
		}
		
	}
}
