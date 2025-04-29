package ifsp;

//Classe ProgramaPrincipal
public class ProgramaPrincipal {
public static void main(String[] args) {
   // Instanciação de produtos usando diferentes construtores
   Produto produto1 = new Produto("Notebook", 3500.00, 10);
   Produto produto2 = new Produto("Mouse", 150.00);

   // Exibição inicial
   System.out.println("Informações iniciais dos produtos:");
   produto1.exibirInfo();
   produto2.exibirInfo();

   System.out.println("\nAlterações no estoque:");

   // Adicionar e remover estoque
   produto1.adicionarEstoque(7);
   produto2.adicionarEstoque(10);
   produto1.removerEstoque(3);
   produto2.removerEstoque(12);
   

   // Exibição após alterações
   System.out.println("\nInformações finais dos produtos:");
   produto1.exibirInfo();
   produto2.exibirInfo();
}
}

