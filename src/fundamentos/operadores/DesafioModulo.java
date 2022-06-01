package fundamentos.operadores;

import javax.swing.JOptionPane;

public class DesafioModulo {
	public static void main(String[] args) {
		//Ler num 1
		//ler num 2
		//+ - * / %
		double num1;
		double num2;
		String operacao;
		
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro número:"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número:"));
		operacao = JOptionPane.showInputDialog("Insira a operacao:");
		
		double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1 , operacao , num2 , resultado);
		
		
	}
}
