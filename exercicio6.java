package exercicios;
import java.util.ArrayList;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		ArrayList<Double> notas = new ArrayList<>();
		Scanner sc = new Scanner(System.in);


		boolean continuar = true;
				
		while (continuar) {
			System.out.println("Digite a nota");
			double nota = sc.nextDouble();
			notas.add(nota);
			
			System.out.println("Deseja continuar adicionando notas? (s/n)");
			String resposta = sc.next(); 
			
			if (resposta.equalsIgnoreCase("n")) {
                continuar = false;
            }
		}
		
		double soma = 0;
		for (Double nota : notas) {
			soma += nota;
		}
		
		double media = soma / notas.size();
		System.out.println(media);
		
		
	}

}
