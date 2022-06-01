package fundamentos;

public class AreaCircunferencia {
	
	
	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.141592; //o final é para definir pi como uma cosntante, não vai ser possível mudar o valor dele.
		
		double area = PI * raio * raio;
		
		System.out.println(PI * raio * raio);
		System.out.println("Ou");
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Area = "+area);
		
	}

}
