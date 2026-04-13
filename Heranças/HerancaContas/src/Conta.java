public class Conta {
    private String titular;
    private double saldo;

    
    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }


    public Conta() {
    }


    public String getTitular() {
        return titular;
    }


    public void setTitular(String titular) {
        this.titular = titular;
    }


    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente");
        }else{
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso");
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de "+ valor +" realizado com sucesso");
    }

    
    
}
