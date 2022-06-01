package classe;

import java.util.Scanner;

public class Jantar {
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		Comida com = new Comida();
		Pessoa p = new Pessoa();
		System.out.println("Insira  o nome da pessoa: ");
		p.nome = c.next();
		System.out.println("Insira  o peso da pessoa: ");
		p.peso = c.nextDouble();
		
		
		int i = 0;
		while(i != -1) {
		System.out.println("Insira o nome da "+ (i+1) + " comida: ");
		com.nome = c.next();
		System.out.println("Insira o peso da "+ (i+1) + " comida: " );
		com.peso = c.nextDouble();
		
		double a = p.Comer(com);
		p.peso = a;
		i++;
		System.out.println("Digite -1 caso queira terminar o programa e qualquer outro numero se quiser continuar.");
		i = c.nextInt();
		System.out.println("o peso de " + p.nome + " eh: " + p.peso);

		}
		System.out.println("o peso final de " + p.nome+ " eh: " + p.peso + "Kg");
		
	}
}
