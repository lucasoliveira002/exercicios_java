package atividades;

public class Animal {
	private String nome;
	private Integer idade;
	
	public Animal() {
		this.nome = "";
		this.idade = 0;
	}
	
	public Animal(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String toString() {
		return "Animal [nome=" + nome + ", idade=" + idade + "]";
	}
	
	public void emitirSom() {
		System.out.println( "Som do aninal ");
	}
	

}
