package sistemasafebankdigital;

public class Debito extends Cartao{
    
    public Debito(){}
    
    public void realizarCompraDebito(double v){
        if(this.conta.getSaldo() < v){
            System.out.println("Saldo insuficiente");
            return;
        }else{
            System.out.println("");
        }
    }
    
    
        
}
