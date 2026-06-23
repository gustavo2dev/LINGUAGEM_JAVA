import java.util.Scanner;
import MODULES.Academia;
import MODULES.Aluno;
import MODULES.Professor;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* cadastro da academia top */

        System.out.println(" CADASTRO DA ACADEMIA ");

        System.out.print("Nome da academia: ");
        String nomeAcademia = sc.nextLine();

        System.out.print("Endereço: ");
        String endereco = sc.nextLine();

        Academia academia = new Academia(nomeAcademia, endereco);

        /* cadastro do professorsinho */

        System.out.println("\n CADASTRO DO PROFESSOR ");

        System.out.print("Nome do professor: ");
        String nomeProfessor = sc.nextLine();

        System.out.print("Especialidade: ");
        String especialidade = sc.nextLine();

        Professor professor = new Professor(nomeProfessor, especialidade);

        /* Cadastro do anluninho */
        System.out.println("\n CADASTRO DO ALUNO ");

        System.out.print("Nome do aluno: ");
        String nomeAluno = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Objetivo: ");
        String objetivo = sc.nextLine();

        Aluno aluno = new Aluno(nomeAluno, idade, objetivo);


        /* printagens dos dados */

        System.out.println("DADOS CADASTRADOS");
        System.out.println();

        System.out.println("\nACADEMIA");
        System.out.println("Nome: " + academia.getNome());
        System.out.println("Endereço: " + academia.getEndereco());

        System.out.println("\nPROFESSOR");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Especialidade: " + professor.getEspecialidade());

        System.out.println("\nALUNO");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Objetivo: " + aluno.getObjetivo());

        sc.close();
    }
}