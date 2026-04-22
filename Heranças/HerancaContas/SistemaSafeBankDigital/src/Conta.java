public class Conta {
    private int id;
    private String titular;
    private String agencia;
    private String numeroConta;
    private double saldo;
    private String senha;

    public Conta(String titular, String agencia, String numeroConta, double saldo, String senha) {
        this.titular = titular;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.senha = senha;
    }

    public Conta() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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
