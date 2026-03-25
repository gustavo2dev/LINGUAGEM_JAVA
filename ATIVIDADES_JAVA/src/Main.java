import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo r = new Retangulo();
        
        System.out.print("Digite a largura: ");
        r.largura = sc.nextDouble();
        
        System.out.print("Digite a altura: ");
        r.altura = sc.nextDouble();
        
        System.out.println("Área: " + r.calcularArea());
        System.out.println("Perímetro: " + r.calcularPerimetro());
        
        sc.close();
    }
}