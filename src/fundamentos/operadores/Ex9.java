package fundamentos.operadores;

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		int l = 0;
		Scanner k = new Scanner(System.in);
		int a;
		int b = 0;
		int maior = 0;
		
		for (; l <= 9 ; l++) {
			System.out.println("digite o " +(l+ 1) + " numero");
			a = k.nextInt();
			if(a > b) {
				maior = a;
			}
			b = a;
		}
		System.out.println("o maior numero foi " + maior);
	}
}
