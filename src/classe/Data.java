package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	String dataFormada() {
		String dataFormada = String.format(" %d/%d/%d\n",dia,mes,ano);
		return dataFormada;
	}
	
	Data (int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	Data (){
		dia = 1;
		mes = 1;
		ano =1970;
	}
	
}
