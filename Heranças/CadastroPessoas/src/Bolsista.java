public class Bolsista extends Aluno {
    private double bolsa;

    public Bolsista(int matricula,String nome, String sexo, int idade, String curso, double mensalidade, double bolsa) {
        super(matricula, nome, sexo, idade, curso, mensalidade);
        this.bolsa = bolsa;
    }
    public Bolsista() {

    }
    public double getBolsa() {
        return bolsa;
    }
    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    public String tipoBolsa(){
        if(this.bolsa == this.getMensalidade()){
            return "Bolsa Integral";
        } else if (this.bolsa > this.getMensalidade()/2){
            return "Bolsa Parcial";
        } else {
            return "Bolsa de Auxílio";
        }
    }

    public void renovarBolsa(){
        System.out.println("Renovando bolsa para " + getNome() + "...");
        // Lógica de renovação da bolsa (exemplo: aumentar a bolsa em 10%)
        this.bolsa *= 1.10;
        System.out.println("Bolsa renovada! Novo valor: " + this.bolsa);
    }

    

    @Override
    public void setInfo(){
        super.setInfo();
        System.out.println("Bolsa: " + this.bolsa);
        System.out.println("Tipo de Bolsa: " + tipoBolsa());
    }

    @Override
    public void pagarMensalidade(){
        if (isStatus()) {
            double valorAPagar = (getMensalidade() - getBolsa());
            if (valorAPagar <= 0) {
                System.out.println(getNome() + " tem uma bolsa que cobre toda a mensalidade. Nenhum pagamento necessário.");
            } else {
                System.out.println(getNome() + " pagou a mensalidade de " + valorAPagar);
            }
        }
    }


    
}
