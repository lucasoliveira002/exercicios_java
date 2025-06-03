package atividades;

public class Cachorro extends Animal{
	
	private String som;
	
	public Cachorro() {
		super();
		this.som = "Latido";
	}
	
	public Cachorro(String nome, Integer idade, String som) {
		super(nome, idade);
		this.som = som;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String toString() {
		return "Cachorro [som=" + som + "]";
	}
	
	public void emitirSom() {
		System.out.println("Auauauauauauaua");
	}
	
}
