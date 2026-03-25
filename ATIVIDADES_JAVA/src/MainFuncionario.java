import java.util.Scanner;

public class MainFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();
        
        System.out.println("CADASTRO DE FUNCIONÁRIO");
        
        System.out.print("Nome: ");
        f.nome = sc.nextLine();
        
        System.out.print("Salário Bruto: R$ ");
        f.salarioBruto = sc.nextDouble();
        
        System.out.print("Imposto: R$ ");
        f.imposto = sc.nextDouble();
        
        System.out.println("DADOS DO FUNCIONÁRIO");
        System.out.println("Nome: " + f.nome);
        System.out.println("Salário Bruto: R$ " + f.salarioBruto);
        System.out.println("Imposto: R$ " + f.imposto);
        System.out.println("Salário Líquido: R$ " + f.calcularSalarioLiquido());
        
        System.out.print("\nDigite a porcentagem de aumento: ");
        double aumento = sc.nextDouble();
        f.aumentarSalario(aumento);
        
        System.out.println("\nDADOS ATUALIZADOS");
        System.out.println("Nome: " + f.nome);
        System.out.println("Salário Bruto: R$ " + f.salarioBruto);
        System.out.println("Imposto: R$ " + f.imposto);
        System.out.println("Salário Líquido: R$ " + f.calcularSalarioLiquido());
        
        sc.close();
    }
}