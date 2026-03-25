public class Funcionario {
    String nome;
    double salarioBruto;
    double imposto;
    
    double calcularSalarioLiquido() {
        return salarioBruto - imposto;
    }
    
    void aumentarSalario(double porcentagem) {
        salarioBruto += salarioBruto * (porcentagem / 100);
    }
}