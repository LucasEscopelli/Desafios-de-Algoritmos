package classe;

public class AreaCirc {
	double raio;
	static  final double PI = 3.14; ////aqui o pi esta declarado na classe com static final, ou seja, alem de ele ser estaitco, nao precisando de uma instancia pra acessar, bastando o nome da classe, ele tambem eh um valor final, ou seja, constante, nao pode ser alterado
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
		
	}
	
	static double area(double raio) {
		//aqui tem o static, ou seja, eh estatico, da classe, nao preciso criar uma instancia pra chamar ele, basta puxar ele direto pelo nome da classe
		return PI * Math.pow(raio, 2);
		
	}
}
