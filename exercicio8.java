package exercicios;
import java.util.ArrayList;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		ArrayList<Integer> lista_principal = new ArrayList<>();
		ArrayList<Integer> impares = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		for (int i = 0 ; i<10; ++i) {
			System.out.println("Digite um número natural inteiro:");
			Integer numero = sc.nextInt();
			lista_principal.add(numero);
			
			if (numero % 2 != 0) {
				impares.add(numero);
			}
		}
		System.out.println(impares);
	}

}
