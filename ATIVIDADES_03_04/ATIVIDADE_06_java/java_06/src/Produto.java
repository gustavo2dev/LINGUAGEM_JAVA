public class Produto {
    private String nome;
    private int quantidadeEmEstoque;

    
    public Produto(String nome) {
        this.nome = nome;
        this.quantidadeEmEstoque = 0;
    }

    
    public String getNome() {
        return nome;
    }

    
    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if (quantidadeEmEstoque < 0) {
            System.out.println("Erro: Quantidade em estoque não pode ser negativa");
        } else {
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        }
    }
}
