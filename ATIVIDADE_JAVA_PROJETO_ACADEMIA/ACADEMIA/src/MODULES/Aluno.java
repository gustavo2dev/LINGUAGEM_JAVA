package MODULES;

public class Aluno {

    private String nome;
    private int idade;
    private String objetivo;

    public Aluno(String nome, int idade, String objetivo) {
        this.nome = nome;
        this.idade = idade;
        this.objetivo = objetivo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

}
