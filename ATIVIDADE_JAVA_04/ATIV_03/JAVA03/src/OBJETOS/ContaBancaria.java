package OBJETOS;

public class ContaBancaria {
    public String titular;
    public double saldo;
    public boolean statusConta = false;


    public void abrirConta(){
        this.statusConta = true;
        this.saldo = 0;
        this.titular = "marco";
    }

    public void depositar(double Valor){
        if (statusConta == true) {
            this.saldo += Valor;
        }else{
            System.out.println("Para executar operações precisa ter uma conta ativa!!!");
        }
    }

    public void sacar(double Valor){
        if (statusConta == true) {
            if (Valor <= this.saldo) {
                this.saldo -= Valor;
            }else{
                System.out.println("Valor solicitado maior que o Saldo!!");
            }
        }else{
            System.out.println("Para executar operações precisa ter uma conta ativa!!!");
        }
    }
    
}
