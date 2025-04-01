package ifsp;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite sua idade: ");
	
	Integer idade = sc.nextInt();
	
	if (idade <=12) {
		System.out.println("Infantil");
	}
	else if (idade>=13 && idade <=17) {
		System.out.println("Juvenil");
	}
	else if (idade>=18 && idade <=40) {
		System.out.println("Adulto");
	}
	else {
		System.out.println("Master");
	}
	
	}

}
