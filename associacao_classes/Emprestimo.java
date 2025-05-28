package atividade;
import java.time.LocalDate;

public class Emprestimo {
	
	private String livro_nome;
	private LocalDate data;
	private Leitor leitor;
	
	public Emprestimo(
			String livro_nome,
			Integer diaData,
			Integer mesData,
			Integer anoData,
			String nome,
			Integer matricula
		) {
		this.livro_nome = livro_nome;
		this.data = LocalDate.of(anoData, mesData, diaData );
		this.leitor= new Leitor(nome, matricula);
	}
	
	public void detalharEmprestimo() {
	    System.out.println("Nome do livro: " + livro_nome);
	    System.out.println("Dia do emprestimo: " + data.getDayOfMonth());
	    System.out.println("Mês do emprestimo: " + data.getMonthValue());
	    System.out.println("Ano do emprestimo: " + data.getYear());
	    System.out.println("Nome do leitor: " + leitor.getNome());
	    System.out.println("Matricula do leitor: " + leitor.getMatricula());
	}


	public String getLivro_nome() {
		return livro_nome;
	}

	public void setLivro_nome(String livro_nome) {
		this.livro_nome = livro_nome;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Leitor getLeitor() {
		return leitor;
	}

	public void setLeitor(Leitor leitor) {
		this.leitor = leitor;
	}
	
	

}