package ifsp;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		
		Integer number1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		
		Integer number2 = sc.nextInt();	
		
		System.out.println("Digite o terceiro numero: ");
		
		Integer number3 = sc.nextInt();
		
		Integer media = ( number1 + number2 + number3 ) / 3;
		
		if( media >= 7 ) {
			System.out.println("Aprovado");
		}
		else if( media >= 4 && media < 7 ) {
			System.out.println("Recuperação");
		}
		else {
			System.out.println("Reprovado");
		}
		
		
	}

}
