package sistemasafebankdigital;

public class Conta {
    private String titular;
    private double saldo;
    private int conta;
    private int digitoVerificador;
    private int agencia;

    
    public Conta(String titular, double saldo, int conta, int dv, int agencia) {
        this.titular = titular;
        this.saldo = saldo;
        this.conta = conta;
        this.digitoVerificador = dv;
        this.agencia = agencia;
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

    public int getConta() {
        return conta;
    }

    public int getDigitoVerificador() {
        return digitoVerificador;
    }

    public int getAgencia() {
        return agencia;
    }
    
    private void exibirConta(){
        System.out.println(this.getConta()+"-"+this.getDigitoVerificador());
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
