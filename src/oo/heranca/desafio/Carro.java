package oo.heranca.desafio;

public class Carro {
	int velocidadeMaxima;
	protected int velocidadeAtual;
	private int delta = 5;
	
	protected Carro (int velocidadeMax){
		velocidadeMaxima = velocidadeMax;
	}
	
	public void acelerar() {
		if(velocidadeAtual + getDelta() > velocidadeMaxima) {
			velocidadeAtual = velocidadeMaxima;
		} else {
			velocidadeAtual += getDelta();
		}
	}
	
	public void frear() {
		if(velocidadeAtual >= delta) {
			velocidadeAtual -= delta;
		}else{
			velocidadeAtual = 0;
		}
		
	}
	
	public String toString() {
		return "velocidade atual é de " + velocidadeAtual + " km/h";
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
}
