package atividade;

public class Hospede {
	
	private String nome;
	private Integer cpf; 
	private String email;
		
	public Hospede(String nome, Integer cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Hospede [nome=" + nome + ", cpf=" + cpf + ", email=" + email + "]";
	}

	

	
}