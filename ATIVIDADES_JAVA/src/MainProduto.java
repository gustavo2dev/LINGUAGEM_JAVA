import java.util.Scanner;

public class MainProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();
        int opcao;
        
        System.out.println("CONTROLE DE ESTOQUE\n");
        
        System.out.print("Nome do produto: ");
        p.nome = sc.nextLine();
        
        System.out.print("Preço: R$ ");
        p.preco = sc.nextDouble();
        
        System.out.print("Quantidade inicial: ");
        p.quantidade = sc.nextInt();
        
        System.out.println("\nProduto cadastrado com sucesso!");
        System.out.println("Valor total em estoque: R$ " + p.calcularValorTotal());
        
        do {
            System.out.println("\nMENU");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Ver estoque");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Quantidade a adicionar: ");
                    int add = sc.nextInt();
                    p.adicionar(add);
                    break;
                case 2:
                    System.out.print("Quantidade a remover: ");
                    int rem = sc.nextInt();
                    p.remover(rem);
                    break;
                case 3:
                    System.out.println("\nESTOQUE ATUAL");
                    System.out.println("Produto: " + p.nome);
                    System.out.println("Preço: R$ " + p.preco);
                    System.out.println("Quantidade: " + p.quantidade);
                    System.out.println("Valor total: R$ " + p.calcularValorTotal());
                    break;
                case 0:
                    System.out.println("\nPrograma encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        
        sc.close();
    }
}