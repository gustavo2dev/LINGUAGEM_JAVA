import java.util.Scanner;

public class MainAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();
        
        System.out.println("=== BOLETIM ESCOLAR ===\n");
        
        System.out.print("Nome do aluno: ");
        a.nome = sc.nextLine();
        
        System.out.print("Primeira nota: ");
        a.nota1 = sc.nextDouble();
        
        System.out.print("Segunda nota: ");
        a.nota2 = sc.nextDouble();
        
        System.out.print("Terceira nota: ");
        a.nota3 = sc.nextDouble();
        
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Aluno: " + a.nome);
        System.out.println("Nota 1: " + a.nota1);
        System.out.println("Nota 2: " + a.nota2);
        System.out.println("Nota 3: " + a.nota3);
        System.out.println("Média: " + a.calcularMedia());
        
        if (a.verificarAprovacao()) {
            System.out.println("Status: APROVADO! Parabéns!");
        } else {
            System.out.println("Status: REPROVADO! Estude mais!");
        }
        
        sc.close();
    }
}