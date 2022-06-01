package fundamentos.operadores;

import java.util.Random;
import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Random random = new Random();
		int aleatorio = random.nextInt(100);
		int tentativas = 10;
		int chute = 0;
		System.out.println("o numero eh " +aleatorio);
		Scanner c = new Scanner(System.in);
		
		int i = 0;
		for(; i <= 9 ; i++) {
			System.out.println("voce tem " +tentativas + " tentativas");
			tentativas--;
			chute = c.nextInt();
			if(chute == aleatorio) {
				System.out.println("voce acertou o numero!");
				break;
			}else if (tentativas == 0 ){
				System.out.println("acabaram as tentativas!");
			}else {
				System.out.println("tente novamente!");
			}
		}
		System.out.println("fim do programa!");
		c.close();
	}
}
