package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
	public static void main(String[] args) {
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 5;
		
		Heroi heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 4;
		

		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("monstro tem => " + monstro.vida + " de vida");
		System.out.println("heroi tem => " + heroi.vida + " de vida");
		

		System.out.println("y = " + monstro.y);
		System.out.println("x = " + monstro.x);
	}
	
}
