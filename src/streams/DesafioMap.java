package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		
		

		Function<Integer, String> toBi = n -> {
			return n.toBinaryString(n);
		};
		
		System.out.println(toBi.apply(6));
		
		Function<String, String> inverte = p ->{
			StringBuilder inverter = new StringBuilder(p);
			return inverter.reverse().toString();
		};
		
		Function<String, Integer> intDnv = s -> Integer.parseInt(s, 2);
		
		System.out.println(toBi.andThen(inverte).andThen(intDnv).apply(6));
		
		System.out.println();
		
		nums.stream()
		.map(toBi)
		.map(inverte)
		.map(intDnv)
		.forEach(System.out::println);
		
		
	}
}
