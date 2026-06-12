
// Classe Principal com o metodo Main
import objetos.Ventilador;

public class Main {
    public static void main(String[] args) {
        // Instanciando o objeto
        Ventilador c1 = new Ventilador();
       
        // Definindo os atributos iniciais
        c1.marca = "philco";
        c1.velocidade = 2;
        c1.ligado = false;

        // Testando os método
        System.out.println("Tentando aumentar velocidade com ele desligado:");
        c1.aumentarVelocidade(); // Deve dar aviso
       
        System.out.println("\nLigando e mexendo no velocidade:");
        c1.ligar();
        c1.aumentarVelocidade();
        c1.aumentarVelocidade();
        c1.Girar();
    }   
}