package ifsp;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Crie sua senha: ");
		
		String senha_oficial = sc.next();
		
		boolean acesso = false;
		
		for (int i = 0; i < 3; i++) {
			
			System.out.println("Acesso: ");
			
			String senha_acesso = sc.next();
			
			if ( senha_acesso.equals(senha_oficial) ) {
				acesso = true;
				break;
			}
			
		}
		
		if( acesso )
			System.out.println("Acesso concedido !");
		else
			System.out.println("Acesso BLOQUEADO !!!!!!!!!!");
	}

}
