package atividade;

public class Leitor {
	
	private String nome;
	private Integer matricula; 
		
	public Leitor(String nome, Integer matricula) {
		this.nome = nome;
		this.matricula = matricula;	
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Leitor [nome=\" + nome + \", matricula=\" + matricula]";
	}

	

	
}