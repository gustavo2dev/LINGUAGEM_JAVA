import java.util.Scanner;

public class ativ02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = 1234;
        int digitada;

        System.out.print("Digite a senha: ");
        digitada = sc.nextInt();

        if (digitada == senha) {
            System.out.println("Acesso liberado!");
        } else {
            System.out.println("Acesso negado!");
        }

        sc.close();
    }
}