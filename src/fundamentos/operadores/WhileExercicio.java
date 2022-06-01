package fundamentos.operadores;

import java.util.Scanner;

public class WhileExercicio {
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		String b = " ";
		String a = "não";
		
		while (a.equals("não")) {
			System.out.println("Digite aqui a sua linha: ");
			b = c.next();
			a = b.equals("termina") ? "sim" : "não";
		}
		
		System.out.println("Laço terminado!");
		c.close();
	}
}
