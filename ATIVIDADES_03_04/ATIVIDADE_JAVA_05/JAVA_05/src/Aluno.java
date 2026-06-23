public class Aluno {
    private String nome;
    private double nota;


    public Aluno(String nome, double nota) {
        this.nome = nome;
        setNota(nota); 
    }

 
    public String getNome() {
        return nome;
    }

   
    public double getNota() {
        return nota;
    }

  
    public void setNota(double nota) {
        if (nota > 0.0 && nota < 10.0) {
            this.nota = nota;
        } else {
            System.out.println("Nota inválida");
        }
    }
}
