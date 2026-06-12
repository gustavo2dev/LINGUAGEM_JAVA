package objetos;

class Ventilador {
    // Atributos
    public String marca;
    public int velocidade;
    public boolean ligado;
    public boolean girar;

    // Métodos
    public void ligar() {
        this.ligado = true;
        System.out.println("Ventilador ligado!");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("Ventilador desligado.");
        this.velocidade += 0;
    }

    public void aumentarVelocidade() {
        if (this.ligado) {
            if (this.velocidade == 0) {
                this.velocidade = 1;
                System.out.println("Velocidade aumentado para: " + this.velocidade);
            }
            else if(this.velocidade == 1){
                 this.velocidade = 2;
                System.out.println("Velocidade aumentado para: " + this.velocidade);
            }
            else if(this.velocidade == 2){
                 this.velocidade = 3;
                System.out.println("Velocidade aumentado para: " + this.velocidade);
            }
            else if(this.velocidade == 3){
                 this.velocidade = 0;
                 this.ligado = false;
                System.out.println("Velocidade diminuindo para: " + this.velocidade);
            } 
        } 
        else {
            System.out.println("Não é possível aumentar a velocidade com o ventilador desligado.");
        }
    }

    public void Girar(){
        if (girar == false) {
            this.girar = true;
            System.out.println("Ventilador girado para: true");
        }
        else{
            this.girar = false;
            System.out.println("Ventilador girado para: false");
        }
    }

}