// Classe Principal com o metodo Main
public class Main {
    public static void main(String[] args) {
        // Instanciando o objeto
        ControleRemoto c1 = new ControleRemoto();
       
        // Definindo os atributos iniciais
        c1.marca = "Samsung";
        c1.volume = 20;
        c1.ligado = false;

        // Testando os métodos
        c1.status();
       
        System.out.println("Tentando aumentar volume com ele desligado:");
        c1.aumentarVolume(); // Deve dar aviso
       
        System.out.println("\nLigando e mexendo no volume:");
        c1.ligar();
        c1.aumentarVolume();
        c1.aumentarVolume();
       
        // Mostrando o status final
        c1.status();
    }
}
