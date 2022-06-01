package classe;

public class Pessoa {
	String nome;
	double peso;
	
	double Comer(Comida comida){
		if(comida!=null) {
			this.peso += comida.peso;
			
			
		}
		return this.peso;
		
		
	}
}
