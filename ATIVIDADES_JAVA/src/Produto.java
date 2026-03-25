public class Produto {
    String nome;
    double preco;
    int quantidade;
    
    void adicionar(int quantidadeAdicionar) {
        quantidade += quantidadeAdicionar;
        System.out.println(quantidadeAdicionar + " unidade(s) adicionada(s) ao estoque.");
    }
    
    void remover(int quantidadeRemover) {
        if (quantidadeRemover > quantidade) {
            System.out.println("Erro: Quantidade insuficiente em estoque!");
        } else {
            quantidade -= quantidadeRemover;
            System.out.println(quantidadeRemover + " unidade(s) removida(s) do estoque.");
        }
    }
    
    double calcularValorTotal() {
        return preco * quantidade;
    }
}