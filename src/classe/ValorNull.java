package classe;

public class ValorNull {
	public static void main(String[] args) {
		String s1 = "";
		System.out.println(s1.concat("!!!!"));
		
		//String s2;
		//System.out.println(s2.concat("????")); nao pode pois a variavel nao eh inicializada dentro do metodo
		//se isso fosse feito na classe, daria certo (String s2;)
		
		Data d1 = Math.random() > 0.5 ? new Data() : null;
		if(d1 != null) {
		d1.mes = 3; //isso nao da certo em caso de nulo pois nao foi criado um endereco de memoria p/ essa variavel
		}
	}
}
