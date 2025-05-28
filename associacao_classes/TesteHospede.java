package atividade;

public class TesteHospede {
		
	public static void main(String[] args) {
		
		Reserva r1 = new Reserva(1,12,6,2025,13,6,2025,"Lucas",12345,"lucas@gmail.com");
		
		r1.exibirResumo();
		
		System.out.println("-----------------------------------------------");
		
		Reserva r2 = new Reserva(2,20,6,2025,30,6,2025,"Bernardo",54321,"bernardo@gmail.com");
		
		System.out.println(r2);
		
		System.out.println("-----------------------------------------------");
		
		Reserva r3 = new Reserva(3,14,6,2025,20,6,2025,"Rafael",55555,"rafael@gmail.com");
		
		System.out.println(r3);
		
		System.out.println("-----------------------------------------------");
		
		Emprestimo e1 = new Emprestimo("Corinthians", 2, 7, 2025, "Lucas", 123456);

		
		e1.detalharEmprestimo();
		
	}
	
	
}