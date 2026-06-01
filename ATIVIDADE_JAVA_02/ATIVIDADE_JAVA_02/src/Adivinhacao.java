import java.util.Scanner;

public class Adivinhacao{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numeroTentativas = 0;
        int numeroSecreto = 17;
        int palpite;

        System.out.println("----------------Digite 1 para iniciar:----------------");

        if (sc.nextInt() == 1) {

            do {

                System.out.println("Adivinhe o número (de 1 a 30): ");
                palpite = sc.nextInt();

                if (palpite != numeroSecreto) {
                  System.out.println("Errado! Tente novamente.");
                }

                numeroTentativas = numeroTentativas + 1;

            } while (palpite != numeroSecreto);

            System.out.println("Parabéns! Você acertou o número secreto ele era: "+ numeroSecreto + " E vc acertou em "+ numeroTentativas + " tentativas.");
            sc.close();

        }else{System.out.println("SEU BOSTA PEDI PARA DIGITAR 1 E VC NÃO CONSEGUE KKKK!!!!");}
    }
}
