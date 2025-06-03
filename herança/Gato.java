package atividades;

public class Gato extends Animal{
	
	private String som;
	
	public Gato() {
		super();
		this.som = "Miado";
	}
	
	public Gato(String nome, Integer idade, String som) {
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
		return "Som [som=" + som + "]";
	}
	
	public void emitirSom() {
		System.out.println("miaumiaumiau");
	}
	
}