package fundamentos.operadores;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		
		System.out.println("Digite o dia da semana:");
		Scanner c = new Scanner(System.in);
		String dia = c.next(); //ao inves do equalsIgnoreCase eu poderia usar o .toLowerCase
		
		if(dia.equals("domingo")) {
			System.out.println("O dia digitado é o dia 1 da semana");
		} else if (dia.equalsIgnoreCase("segunda")) {			
			System.out.println("O dia digitado é o dia 2 da semana");
		} else if (dia.equalsIgnoreCase("terça")) {
			System.out.println("O dia digitado é o dia 3 da semana");			
		} else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println("O dia digitado é o dia 4 da semana");
		} else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println("O dia digitado é o dia 5 da semana");
		} else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println("O dia digitado é o dia 6 da semana");
		} else if (dia.equalsIgnoreCase("sabado")) {
			System.out.println("O dia digitado é o dia 7 da semana");
		} else {
			System.out.println("o dia digitado não corresponde a um dia da semana");
		}
		
		System.out.println("Fim");
		
		c.close();
	}
}
