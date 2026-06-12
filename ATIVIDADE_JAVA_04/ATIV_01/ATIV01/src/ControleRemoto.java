class ControleRemoto {
    // Atributos
    public String marca;
    public int volume;
    public boolean ligado;

    // Métodos
    public void ligar() {
        this.ligado = true;
        System.out.println("Controle ligado!");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("Controle desligado.");
    }

    public void aumentarVolume() {
        if (this.ligado) {
            if (this.volume < 100) {
                this.volume += 5;
                System.out.println("Volume aumentado para: " + this.volume);
            } else {
                System.out.println("Volume já está no máximo!");
            }
        } else {
            System.out.println("Não é possível aumentar o volume com o controle desligado.");
        }
    }

    public void diminuirVolume() {
        if (this.ligado) {
            if (this.volume > 0) {
                this.volume -= 5;
                System.out.println("Volume diminuído para: " + this.volume);
            } else {
                System.out.println("Volume já está no mudo!");
            }
        } else {
            System.out.println("Não é possível diminuir o volume com o controle desligado.");
        }
    }

    public void status() {
        System.out.println("\n--- STATUS DO CONTROLE ---");
        System.out.println("Marca: " + this.marca);
        System.out.println("Volume atual: " + this.volume);
        System.out.println("Está ligado? " + (this.ligado ? "Sim" : "Não"));
        System.out.println("---------------------------\n");
    }
}