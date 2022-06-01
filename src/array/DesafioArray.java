package array;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		System.out.println("Digite a quantidade de notas que voce deseja informar: ");
		Scanner c = new Scanner(System.in);
		int quant = c .nextInt();
		double notas[] = new double[quant];
		
		
		for(int i = 0; i < notas.length ; i++) {
			System.out.printf("insira aqui a %d nota: ", (i + 1));
			notas[i] = c.nextDouble();
		}
		double soma = 0;
		for(double nota: notas) {
			soma += nota;
		}
		System.out.println("a media do alunoe eh: " + (soma / notas.length));
		c.close();
	}
}
