package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {


	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double e assim nos demais primitivos
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add('x');
		
		System.out.println("tamanho eh :" + conjunto.size());
		conjunto.add("Teste");
		System.out.println("tamanho eh :" + conjunto.size());
		conjunto.add("teste");
		System.out.println("tamanho eh :" + conjunto.size());
		
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove(2));
		System.out.println("tamanho eh :" + conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(1.2);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll é a uniao dos dois ocnjuntos 
		//|| conjunto.retainAll éa interseção dos dois conjuntos
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}
}
