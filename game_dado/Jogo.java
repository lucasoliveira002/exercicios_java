package game_dado;

import java.util.Random;

public class Jogo {
	private Dado dado1;
	private Dado dado2;
	
	public Jogo() {
		this.dado1 = new Dado();
		this.dado2 = new Dado();
	}
	
	public void jogar() {
		Random random = new Random();
		dado1.setValor( random.nextInt(1,6));
		dado2.setValor( random.nextInt(1,6));
	}
	
	public void resultado() {
		Integer total = dado1.getValor() + dado2.getValor();
		if (total.equals(7)) {
			System.out.println("Venceu!!" + dado1.getValor() + " " + dado2.getValor());
		}
		else {
			System.out.println("Perdeu!!" + dado1.getValor() + " " + dado2.getValor());
		}
	}

}
