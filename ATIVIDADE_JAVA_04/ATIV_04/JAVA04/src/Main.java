public class Main {
    public static void main(String[] args) {
        // Criando a instância (dando o 'new') do CarroCorrida
        CarroCorrida meuCarro = new CarroCorrida();
        meuCarro.piloto = "Ayrton Senna";
        meuCarro.velocidadeAtual = 0;
        meuCarro.combustivel = false; // Começa sem combustível
        meuCarro.aceleracoesSeguidas = 0;

        System.out.println("Piloto: " + meuCarro.piloto);

        // 1. Tentar acelerar sem combustível
        meuCarro.acelerar();

        // 2. Abastecer o carro
        meuCarro.abastecer();

        // 3. Acelerar 4 vezes seguidas para esgotar o combustível
        System.out.println("\n--- Iniciando a Corrida ---");
        meuCarro.acelerar(); // 1ª vez
        meuCarro.acelerar(); // 2ª vez
        meuCarro.acelerar(); // 3ª vez
        meuCarro.acelerar(); // 4ª vez -> Aqui o combustível deve acabar

        // 4. Tentar acelerar novamente com o combustível esgotado para ver a validação
        System.out.println("\n--- Nova tentativa após o combustível acabar ---");
        meuCarro.acelerar();
    }
}
