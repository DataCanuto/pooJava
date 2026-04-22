public class Debito extends Cartao{

    public Debito() {}

    public Debito(String titular, String numeroCartao, String bandeira, int senha, Conta conta, double saldo) {
        super(titular, numeroCartao, bandeira, senha, conta, saldo);
    }
    
    public void realizarCompraDebito(double v){
        if(this.getConta().getSaldo() < v){
            System.out.println("Saldo insuficiente");
            return;
        }else{
            System.out.println("");
        }
    }        
}
