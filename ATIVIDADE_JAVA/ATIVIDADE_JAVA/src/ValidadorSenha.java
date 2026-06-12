import java.util.Scanner;

public class ValidadorSenha {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler dados do teclado
        Scanner teclado = new Scanner(System.in);
       
        // Definição das variáveis de controle
        int senhaCorreta = 2026;
        int maxTentativas = 3;
        int tentativasUsadas = 0;
        boolean acessoConcedido = false;
       
        System.out.println("=== SISTEMA DE SEGURANÇA ===");
       
        // Laço de repetição que roda enquanto não acertar e ainda houver tentativas
        while (tentativasUsadas < maxTentativas && !acessoConcedido) {
            System.out.print("Digite a senha de 4 dígitos: ");
            int senhaDigitada = teclado.nextInt();
            tentativasUsadas++; // Incrementa o número de tentativas
           
            // Laço de escolha (if/else) para verificar a senha
            if (senhaDigitada == senhaCorreta) {
                System.out.println("\n[SUCESSO] Acesso Permitido! Bem-vindo ao sistema.");
                acessoConcedido = true;
            } else {
                int tentativasRestantes = maxTentativas - tentativasUsadas;
                System.out.println("[ERRO] Senha Incorreta!");
               
                if (tentativasRestantes > 0) {
                    System.out.println("Você ainda tem " + tentativasRestantes + " tentativa(s).");
                    System.out.println("---------------------------------------");
                }
            }
        }
       
        // Verificação final caso o laço tenha terminado por falta de tentativas
        if (!acessoConcedido) {
            System.out.println("\n[BLOQUEADO] Conta Bloqueada por excesso de tentativas erradas.");
        }
       
        // Fechando o scanner (boa prática)
        teclado.close();
    }
}