package sistemasafebankdigital;

public class Credito extends Cartao{
    private double limite;

    public Credito() {
    }

    public Credito(double limite) {
        super();
        this.limite = limite;        
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
    
    public void realizarCompraCredito(double v){
        if(this.getLimite() < v){
            System.out.println("Limite insuficiente");
            return;
        }else{
            System.out.println("Operação realizada com sucesso!");
            this.setLimite(this.getLimite() - v);
            return;
        }
    }
    
    
    
        
    
    
}
