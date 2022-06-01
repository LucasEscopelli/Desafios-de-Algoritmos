package classe;

public class EqualsHashcode {
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Lucas";
		u1.email = "LucasEmail";
		
		Usuario u2 = new Usuario();
		u2.nome = "Lucas";
		u2.email = "LucasEmail";
		
		System.out.println(u1.equals(u2));
	}
}
