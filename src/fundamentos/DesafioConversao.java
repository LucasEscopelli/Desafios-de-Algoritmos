package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		String x;
		String y;
		String z;
		
		Double a;
		Double b;
		Double c;
		
		System.out.println("Digite o primeiro salário: ");
		x = s1.nextLine()
				.replace(",", ".");
		a = Double.parseDouble(x);
		
		System.out.println("Digite o segundo salário: ");
		y = s1.nextLine()
				.replace(",", ".");
		b = Double.parseDouble(y);
		
		System.out.println("Digite o terceiro salário: ");
		z = s1.nextLine().
				replace(",", ".");
		c= Double.parseDouble(z);
		
		double media = (a + b + c) / 3;
		System.out.println(media);
		
		s1.close();
	}
}
