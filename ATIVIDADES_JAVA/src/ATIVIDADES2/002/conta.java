public class conta{
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Maria", 1000.0);

        conta.exibirConta();

        conta.depositar(300);
        conta.sacar(200);
        conta.sacar(1500); // teste de saldo insuficiente

        conta.exibirConta();
    }
}