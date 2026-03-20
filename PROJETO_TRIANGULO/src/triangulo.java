import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class triangulo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double xA, xB, xC, yA, yB, yC;
        
        System.out.println("Digite o valor do Triângulo X: ");
            xA = sc.nextDouble();
            xB = sc.nextDouble();
            xC = sc.nextDouble();

        System.out.println("Digite o valor do Triângulo Y: ");
            yA = sc.nextDouble();
            yB = sc.nextDouble();
            yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Triângulo X a área: %.2f %n", areaX);
        System.out.printf("Triângulo X a área: %.2f %n", areaY);

        if (areaX > areaY) {
            System.out.printf("O Triângulo maior é X, e a área é: %.2f %n", areaX);
        }
        else if(areaX < areaY){
            System.out.printf("O Triângulo maior é Y, e a área é: %.2f %n", areaY);
        }else{
            System.out.println("Os dois são iguais!!!");
        }
        
        sc.close();
    }
}
