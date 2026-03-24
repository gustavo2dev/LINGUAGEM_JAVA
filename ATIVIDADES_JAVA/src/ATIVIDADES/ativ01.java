import java.util.Scanner;

public class ativ01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int opcao;

        do {
            // Solicita um número ao usuário
            System.out.print("Digite um número para ver a tabuada: ");
            numero = sc.nextInt();

            // Exibe a tabuada de 1 a 10
            System.out.println("Tabuada de " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }

            // Pergunta se deseja ver outra tabuada
            System.out.print("Deseja ver outra tabuada? (1-Sim / 0-Não): ");
            opcao = sc.nextInt();

        } while (opcao == 1); // repete enquanto o usuário digitar 1

        System.out.println("Programa encerrado.");
        sc.close();
    }
}