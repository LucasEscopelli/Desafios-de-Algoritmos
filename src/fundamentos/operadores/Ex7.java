package fundamentos.operadores;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		int i = 0;
		int soma = 0;
		Scanner c = new Scanner(System.in);
		
		for(; i>=0 ;) {
			System.out.println("digite o seu numero: ");
			i = c.nextInt();
			if(i>=0) {
				int salva = soma; 
				soma = soma + i;
				System.out.println("a soma é igual a : " +salva + "+" +i + "=" +soma);
			}else {
				break;
			}
		}
		System.out.println("fim do programa!");
		c.close();
	}
}
