package ifsp;

public class Produto {
    private String nome;
    private Double preco;
    private Integer quantidade;

    // Construtor completo
    public Produto(String n, Double p, Integer q) {
        this.nome = n;
        this.preco = p;
        this.quantidade = q;
    }

    // Construtor sobrecarregado
    public Produto(String n, Double p) {
        this.nome = n;
        this.preco = p;
        this.quantidade = 0; // Valor padrão
    }

    // Método para exibir informações do produto
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
    }

    // Método para adicionar ao estoque
    public void adicionarEstoque(int q) {
        this.quantidade += q;
        System.out.println("Quantidade adicionada: " + quantidade);
    }

    // Método para remover do estoque
    public void removerEstoque(int q) {
        if (this.quantidade >= q) {
            this.quantidade -= q;
            System.out.println("Quantidade removida: " + quantidade);
        } else {
            System.out.println("Estoque insuficiente para remover!");
        }
    }
}