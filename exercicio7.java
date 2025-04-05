package exercicios;
import java.util.ArrayList;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		ArrayList<Integer> idades = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
			
		Integer maior_de_idade = 0;
		boolean condicao = true;
		while (condicao) {
			System.out.println("Digite a idade");
			Integer idade = sc.nextInt();
			idades.add(idade);
			
			if (idade >= 18) {
				maior_de_idade = maior_de_idade + 1;
			}
			else if (idade < 0) {
				condicao = false;
			}
		}
		System.out.println(maior_de_idade + " da(s) idade(s) digitadas são de maior");


	}

}
