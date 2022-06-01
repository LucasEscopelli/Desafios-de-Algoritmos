package fundamentos.operadores;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		double nota = 0;
		double total = 0;
		double validas = 0;
		double media;
		String p = " ";

		while (nota != -1) {

			System.out.println("Digite a nota: ");
			Scanner c = new Scanner(System.in);
			nota = c.nextDouble();

			if (nota <= 10 && nota >= 0) {
				total += nota;
				validas++;
			} else if (nota == -1) {
				System.out.println("a media sera calculada: ");
			} else {
				System.out.println("Insira uma nota valida.");
			}

		}
		System.out.println("a media final é igual a: " + total / validas);
		
		
		
	}

}
