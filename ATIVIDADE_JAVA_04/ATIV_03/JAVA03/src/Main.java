import OBJETOS.ContaBancaria;

public class Main {
    public static void main(String[] args) {
       System.out.println("Vamos criar uma conta Bancária!!!");

       ContaBancaria b1 = new ContaBancaria();

       b1.abrirConta();
       b1.depositar(100);
       b1.sacar(500);
       b1.sacar(50);
       System.out.println("Saldo final: " + b1.saldo);
    }
}
