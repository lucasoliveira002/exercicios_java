package atividades;

public class ContaBancaria {
	private String titular;
	private Double saldo;
	private Integer numero;
	
	public ContaBancaria(String t, Double s, Integer n ) {
		this.titular= t;
		this.saldo = s;
		this.numero = n;
	}

	public ContaBancaria(String t, Integer n) {
		this.titular= t;
		this.saldo = 0.0;
		this.numero = n;
	}
	
	//gets
		public String getTitular() {
			return titular;
		}
		public Double getSaldo() {
			return saldo;
		}
		public Integer getNumero() {
			return numero;
		}
		
		//sets
		public void setTitular(String titular) {
			this.titular = titular;
		}
		public void setSaldo(Double saldo) {
			this.saldo = saldo;
		}
		public void setNumero(Integer numero) {
			this.numero = numero;
		}
}
