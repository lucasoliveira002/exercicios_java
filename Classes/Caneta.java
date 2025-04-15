package atividades;

public class Caneta {

	//criacao dos atributos
	private String cor;
	private String marca;
	private String tipo;
	
	//definindo valores de inicializacao
	public Caneta() {
		this.cor = "indefinido";
		this.marca = "indefinido";
		this.tipo = "indefinido";
		
	}
	
	//definiçao de variavel nos atributos
	public Caneta(String c,String m,String t) {
		this.cor = c;
		this.marca = m;
		this.tipo = t;			
	}
	
	//gets
	public String getCor() {
		return cor;
	}
	public String getMarca() {
		return marca;
	}
	public String getTipo() {
		return tipo;
	}
	
	//sets
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
