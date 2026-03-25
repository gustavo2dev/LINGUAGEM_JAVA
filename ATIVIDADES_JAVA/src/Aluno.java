public class Aluno {
    String nome;
    double nota1;
    double nota2;
    double nota3;
    
    double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }
    
    boolean verificarAprovacao() {
        return calcularMedia() >= 7;
    }
}