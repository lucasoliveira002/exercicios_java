package game_dado;

public class Dado {
	private Integer valor;
	
	public Dado() {
		this.valor = 0;
	}
	
	public Dado( Integer v) {
		this.valor = v;
	}
	
	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}
}
