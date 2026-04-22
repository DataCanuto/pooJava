public class Poupanca extends Conta {
    private double juros;
    private double rendimento;

    public Poupanca() {}

    // Construtor sem juros/rendimento (podem ser definidos depois via setters)
    public Poupanca(String titular, String agencia, String numeroConta, double saldo, String senha) {
        super(titular, agencia, numeroConta, saldo, senha);
    }

    // Construtor completo com juros e rendimento
    public Poupanca(String titular, String agencia, String numeroConta, double saldo, String senha, double juros, double rendimento) {
        super(titular, agencia, numeroConta, saldo, senha);
        this.juros = juros;
        this.rendimento = rendimento;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    @Override
    public void sacar(double valor){
        if (valor > this.getSaldo()) {
            System.out.println("Saldo insuficiente");
        }else{
            setSaldo(getSaldo() - (valor + this.juros));
            System.out.println("Saque realizado com sucesso");            
        }
    }
    public void depositar(double valor){
        setSaldo(getSaldo() + valor);
        System.out.println("Depósito de "+ valor +" realizado com sucesso");
    }

    public void calcularRendimento(){
        setSaldo(getSaldo() + getSaldo() * this.rendimento);
        System.out.println("Rendimento: " + getSaldo() * this.rendimento);
        
        System.out.println("Rendimento calculado com sucesso");
    }
} 
