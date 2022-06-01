package oo.polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(88.95);
		
		Arroz a = new Arroz(0.1);
		Feijao f = new Feijao(0.05);
		
		p1.comer(a);
		p1.comer(f);
		
		System.out.println(p1.getPeso());
		
		Sorvete s = new Sorvete(0.2);
		
		p1.comer(s);
		
		System.out.println(p1.getPeso());
		
		
	}
}
