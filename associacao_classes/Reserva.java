package atividade;
import java.time.LocalDate;

public class Reserva {
	
	private Integer numero;
	private LocalDate entrada;
	private LocalDate saida;
	private Hospede hospede;
	
	public Reserva(
			Integer numero,
			Integer diaEntrada,
			Integer mesEntrada,
			Integer anoEntrada,
			Integer diaSaida,
			Integer mesSaida,
			Integer anoSaida,
			String nome,
			Integer cpf,
			String email	
		) {
		this.numero = numero;
		this.entrada = LocalDate.of(anoEntrada, mesEntrada, diaEntrada );
		this.saida = LocalDate.of(anoSaida, mesSaida, diaSaida );
		this.hospede= new Hospede(nome,cpf,email);
	}
	
	public void exibirResumo() {
	    System.out.println("Número da reserva: " + numero);
	    System.out.println("Dia da entrada: " + entrada.getDayOfMonth());
	    System.out.println("Mês da entrada: " + entrada.getMonthValue());
	    System.out.println("Ano da entrada: " + entrada.getYear());
	    System.out.println("Dia da saída: " + saida.getDayOfMonth());
	    System.out.println("Mês da saída: " + saida.getMonthValue());
	    System.out.println("Ano da saída: " + saida.getYear());
	    System.out.println("Nome: " + hospede.getNome());
	    System.out.println("CPF: " + hospede.getCpf());
	    System.out.println("Email: " + hospede.getEmail());
	}


	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public LocalDate getEntrada() {
		return entrada;
	}
	public void setEntrada(LocalDate entrada) {
		this.entrada = entrada;
	}

	public LocalDate getSaida() {
		return saida;
	}
	public void setSaida(LocalDate saida) {
		this.saida = saida;
	}

	public Hospede getHospede() {
		return hospede;
	}
	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}

	@Override
	public String toString() {
		return "Reserva [\nnumero=" + numero + ", \nentrada=" + entrada + ", \nsaida=" + saida + ", \nhospede=" + hospede + "]";
	}
	
	
	

}