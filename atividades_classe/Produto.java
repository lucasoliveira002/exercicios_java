package atividades;

public class Produto {
	
	private String nome;
	private Double preco;
	private Integer estoque;
	
	//construtores
	public Produto(String n, Double p, Integer e ) {
		this.nome= n;
		this.preco = p;
		this.estoque = e;
	}
	
	public Produto(String n) {
		this.nome = n;
		this.preco = 0.0;
		this.estoque = 0;
	}
	
	
	//gets
	public String getNome() {
		return nome;
	}
	public Double getPreco() {
		return preco;
	}
	public Integer getEstoque() {
		return estoque;
	}
	
	//sets
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}
	

}
