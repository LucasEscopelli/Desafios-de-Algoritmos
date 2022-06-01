package array;

public class Foreach {
	public static void main(String[] args) {
		
		double [] notas = {9.9, 9.8, 9.7, 8.7};
		
		for(int i = 0; i<notas.length; i++) {
			System.out.println(notas[i] + " ");
		}
		
		for(double nota: notas) {
			System.out.println(nota +  " ");
		}
	}
}
