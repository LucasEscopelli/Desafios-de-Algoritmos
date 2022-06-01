package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		double media = 5.1;
		//String resultadoRecuperacao = media >= 5.0 ? "em recuperação." : "reprovado";
		//String resultado = media >= 7.0 ? "aprovado." : resultadoRecuperacao; // a media é maior ou igual a sete? Sim: Aprovado. Não: Reprovado
		
		// OU
		String resultado = media >= 7.0 ? "aprovado." : media >= 5.0 ? "em recuperação." : "reprovado";
		
		System.out.println("O aluno está " + resultado);
	}
}
