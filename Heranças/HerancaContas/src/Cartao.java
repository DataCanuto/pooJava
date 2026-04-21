package sistemasafebankdigital;

import java.util.List;

public class Cartao {
    private String nomeTitular;
    private int numeroCartao;
    private Conta conta;
    private int senha;
    private boolean credito;
    private String bandeira;

    public Cartao() {
    }

    public Cartao(String nomeTitular, int numeroCartao, Conta conta, int senha,boolean credito,String bandeira) {
        this.nomeTitular = nomeTitular;
        this.numeroCartao = numeroCartao;
        this.conta = conta;
        this.senha = senha;
        this.credito = credito;
        this.bandeira = bandeira;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }    
    
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean isCredito() {
        return credito;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
    }
    
    private static List<String> bandeiras = List.of("VISA","MASTERCARD","ELO");
    
    public boolean verificarBandeira(String bandeira){        
        for (int i = 0; i < bandeiras.size(); i++){
            if(bandeira.equals(bandeiras.get(i))){
                return true;            
            }
        }
        return false;
    }
    
}
