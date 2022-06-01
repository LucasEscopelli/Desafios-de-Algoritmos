package fundamentos.operadores;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		System.out.println("insira a primeira nota: ");
		Scanner c = new Scanner(System.in);
		double h = c.nextDouble();
		System.out.println("insira a segunda nota: ");
		double g = c.nextDouble();
		
		double b = (g + h) / 2;
		
		int a = 1;
		
		while(a == 1){	
		if(b>=0 && b<=10) {
			if(b >= 7) {
				System.out.println("Aluno aprovado");
				a =2;
			}else if(b >= 4 && b <= 7) {
				System.out.println("Aluno em recuperacao");
				a = 2;
			}else if(b < 4) {
				System.out.println("Aluno reprovado");
				a = 2;
			}
		}else{
			System.out.println("Nota nao valida");
		}
		System.out.println("a nota eh " + b);
	}
	}
}
