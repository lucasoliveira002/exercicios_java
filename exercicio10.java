package exercicios;
import java.util.ArrayList;
import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		ArrayList<String> produtos = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		boolean condicao = true;
		while (condicao) {
			System.out.println("Qual acao voce gostaria de realizar?");
			System.out.println("Adicionar itens (adicionar)");
			System.out.println("Excluir itens (exluir)");
			System.out.println("Listar itens (listar)");
			System.out.println("Sair (sair)");
			String comando = sc.next();
			
			if (comando.equalsIgnoreCase("adicionar")) {
				System.out.println("Escreva o produto que voce quer adicionar");
				String produto = sc.next();
				produtos.add(produto);
			}
			else if (comando.equalsIgnoreCase("excluir")) {
				System.out.println("Escreva o nome do produto que devera ser excluido");
				String nome = sc.next();
				
				if (produtos.remove(nome)) {
					System.out.println("Produto removido");
				}
				else {
					System.out.println("Produto não encontrado");
				}
			}
			else if (comando.equalsIgnoreCase("listar")){
				System.out.println(produtos);
			}
			else if (comando.equalsIgnoreCase("sair")){
				condicao = false;
			}
			else {
				System.out.println("DIGITE UM COMANDO VALIDO!!!");
			}
		}
	}

}
