package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Ola pessoal".charAt(2));
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length());
		System.out.println(s.endsWith("Tarde"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.toLowerCase().endsWith("tarde"));
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde\n\n"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		String maisUmaFrase = "Nome:" + nome 
				+ "\nSobrenome:" + sobrenome 
				+ "\nIdade:" + idade
				+ "\nSalario:" + salario + "\n\n";
		System.out.println(maisUmaFrase);
		
		
		System.out.println("Nome:" + nome 
				+ "\nSobrenome:" + sobrenome 
				+ "\nIdade:" + idade
				+ "\nSalario:" + salario);
		
		System.out.printf("O senhor %s %s tem %d anos e recebe %.2f reais por mês",
				nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e recebe %.2f reais por mês",
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual")); //aqui ele vai dar um valor true or false de se o "qual" está presente ou não na frase
		System.out.println("Frase qualquer".indexOf("qual")); //aqui ele vai falar qual a posição da string (lembrando que a posição 1 = 0) em que a parte "qual" começa
		System.out.println("Frase qualquer".substring(6)); //aqui ele vai printar o que tudo o que está na posição de referência em diante, sendo que a posição de referência está dentro do parenteses
		System.out.println("Frase qualquer".substring(6, 10)); //aqui ele vai printar o que está na posição de referência, sendo o primeiro valor onde ele começa e o segundo valor onde ele termina (ele termina uma posição antes do número)
		

	}
}