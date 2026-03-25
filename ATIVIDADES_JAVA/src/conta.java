import java.util.Scanner;

public class conta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ContaBancaria conta = new ContaBancaria("João Dural", 1000.0);
        
        int opcao;
        double valor;
        
        System.out.println("BANCO");
        conta.exibirConta();
        
        do {
            System.out.println("\n MENU");
            System.out.println("0 - Sair");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.print("\nEscolha uma opção: ");
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para saque: ");
                    valor = sc.nextDouble();
                    conta.sacar(valor);
                    break;
                    
                case 2:
                    System.out.print("Digite o valor para depósito: ");
                    valor = sc.nextDouble();
                    conta.depositar(valor);
                    break;
                    
                case 0:
                    System.out.println("\nPrograma encerrado. Obrigado!");
                    break;
                    
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            
        } while (opcao != 0);
        
        sc.close();
    }
}