package fundamentos.operadores;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		System.out.println("digite o numero ");
		Scanner c = new Scanner(System.in);
		
		int b = c.nextInt();
		
		if(b <= 10 && b >= 0 ) {
			System.out.println("o numero este entre 0 e 10");
		}else {
			System.out.println("o numero não este entre 0 e 10");
		}
		
		if(b % 2 == 1) {
			System.out.println("o numero eh impar");
		}else {
			System.out.println("o numero eh par");
		}
		
		c.close();
	}
}
