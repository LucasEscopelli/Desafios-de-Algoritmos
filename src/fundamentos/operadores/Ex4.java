package fundamentos.operadores;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		System.out.println("Digite o numero: ");
		Scanner c = new Scanner(System.in);
		double b = c.nextDouble();
		int contador = 0;
		
		for(int i = 1; i <= b; i++) {
			if(b % i == 0) {
				contador++;
			}
		}
		if(contador == 2 || b == 1) {
			System.out.println("o numero eh primo");
		}else{
			System.out.println("o numero nao eh primo");
		}
		
	}
}
