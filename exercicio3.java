package ifsp;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		
		Integer number1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		
		Integer number2 = sc.nextInt();	
		
		System.out.println("Digite o terceiro numero: ");
		
		Integer number3 = sc.nextInt();
		
		if (number1 >= number2 && number1 >= number3) {
			System.out.println("O maior número é o " + number1);
			if (number1 == number2) {
				System.out.println("O primeiro número digitado e o segundo são iguais");
			}
			else if (number1 == number3) {
				System.out.println("O primeiro número digitado e o terceiro são iguais");
			}
			else {
				System.out.println("Todos os números são diferentes");
			}
		}
		else if (number2 >= number1 && number2 >= number3) {
			System.out.println("O maior número é o " + number2);
			if (number2 == number1) {
				System.out.println("O segundo número digitado e o primeiro são iguais");
			}
			else if (number2 == number3) {
				System.out.println("O segundo número digitado e o terceiro são iguais");
			}
			else {
				System.out.println("Todos os números são diferentes");
			}
		}
		else {
			System.out.println("O maior número é o " + number3);
		}
		
	
	}

}
