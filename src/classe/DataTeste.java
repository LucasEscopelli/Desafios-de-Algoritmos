package classe;


public class DataTeste {
	public static void main(String[] args) {
		

		Data d1 = new Data(03, 05, 2002);
		Data d2 = new Data();

		System.out.println(d1.dataFormada());
		System.out.println(d2.dataFormada());

	}
}
