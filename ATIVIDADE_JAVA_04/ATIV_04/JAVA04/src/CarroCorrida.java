public class CarroCorrida {
    // Atributos da classe
    String piloto;
    int velocidadeAtual;
    boolean combustivel; // true = tem combustível, false = tanque vazio
    int aceleracoesSeguidas; // Contador para controlar o gasto de combustível

    // Método para abastecer o carro
    public void abastecer() {
        this.combustivel = true;
        System.out.println("-> O carro foi abastecido!");
    }

    // Método para acelerar o carro
    public void acelerar() {
        // Validação 1: Verificação de combustível
        if (!combustivel) {
            System.out.println("Aviso: Não é possível acelerar. O tanque está vazio!");
            return;
        }

        // Executa a aceleração
        this.velocidadeAtual += 20; // Aumenta a velocidade de 20 em 20 km/h
        this.aceleracoesSeguidas++;
        System.out.println("Acelerando... Velocidade atual: " + this.velocidadeAtual + " km/h");

        // Validação 2: Limite de velocidade máxima (200 km/h)
        if (this.velocidadeAtual > 200) {
            this.velocidadeAtual = 200;
            System.out.println("-> Velocidade máxima de 200 km/h atingida!");
        }

        // Validação 3: Acabar o combustível se acelerar mais de 3 vezes seguidas
        if (this.aceleracoesSeguidas > 3) {
            this.combustivel = false;
            System.out.println("-> Você acelerou mais de 3 vezes seguidas. O combustível acabou!");
        }
    }

    // Método para frear o carro
    public void frear() {
        this.velocidadeAtual -= 20; // Reduz a velocidade
        if (this.velocidadeAtual < 0) {
            this.velocidadeAtual = 0; // Impede velocidade negativa
        }
        
        // Zera o contador de acelerações seguidas, pois o piloto freou
        this.aceleracoesSeguidas = 0; 
        System.out.println("Freando... Velocidade atual: " + this.velocidadeAtual + " km/h");
    }
}