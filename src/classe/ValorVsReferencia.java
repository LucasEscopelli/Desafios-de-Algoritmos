package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 2;
		double b = a; //atribuicao por valor (tipo prmitivo)
		System.out.println(a + " " + b); 
		
		Data d1 =  new Data(1 , 1 , 1970);
		Data d2 = d1; //atribuicao por referencia (objeto)
		
		System.out.println(d1.dataFormada());
		System.out.println(d2.dataFormada());
		
		
		d1.dia = 1;
		d2.mes = 3;
		d1.ano = 2022;
		
		System.out.println(d1.dataFormada());
		System.out.println(d2.dataFormada());
		
		voltarDataParaValorPadrao(d1);
		System.out.println(d1.dataFormada());
		System.out.println(d2.dataFormada());
		
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
		
	}
}
