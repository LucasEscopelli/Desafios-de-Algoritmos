package lambdas;

@FunctionalInterface
public interface Calculo {
	
	double executar(double a, double b) ;//todo metodo que eu n especificar o encapsulamento em interfaces vai ser abstrato
	
	
	default String legal() {
		return "legal";
	}
	
	static String massa(){
		return "massa";
	}
}
