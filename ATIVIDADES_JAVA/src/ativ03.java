import java.util.Scanner;

public class ativ03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.println("Vamos saber os números entre dois valores!!!");
        System.out.println("Digite o Primeiro valor: ");
        n1 = sc.nextInt();

        System.out.println("Digite outro valor: ");
        n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("Não foi desta vez!!!");
            System.err.println("Digite outros valores que o primeiro seja menor que o segundo!!!");
        } else {
            System.out.println("Os valores entre " + n1 + " e " + n2 + " são:");

            for (int i = n1; i >= n2; i++){
                System.out.println(i);
            }
        }

        System.out.println("Acabouu!!!");
        sc.close();
    }
}