package exercicios;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		Integer idade = sc.nextInt();
		
		System.out.println("Digite sua mensal: ");
		Integer renda_mensal = sc.nextInt();
		
		System.out.println("Digite seu score de crédito: ");
		Integer score_credito = sc.nextInt();
		
		if (idade > 18 && renda_mensal > 2000 && score_credito >= 600) {
			System.out.println("Crédito aprovadp! Todos os requisitos foram atendidos");
		}
		else if (idade < 18 && renda_mensal > 2000 && score_credito >= 600) {
			System.out.println("Crédito recusado! Sua idade não atende os requisitos");
		}
		else if (idade > 18 && renda_mensal < 2000 && score_credito >= 600) {
			System.out.println("Crédito recusado! Sua renda mensal não atende os requisitos");
		}
		else if (idade > 18 && renda_mensal > 2000 && score_credito < 600) {
			System.out.println("Crédito recusado! Seu score de credito não atende os requisitos");
		}
		else {
			System.out.println("Crédito recusado! Nenhum dos requisitos foi atendido");
		}
	}

}
