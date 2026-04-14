public class Veiculo {
    private String placa;
    private double capacidadeTanque;
    private double consumoMedio;

    public Veiculo() {
    }

    public Veiculo(String placa, double capacidadeTanque, double consumoMedio) {
        this.placa = placa;
        this.capacidadeTanque = capacidadeTanque;
        this.consumoMedio = consumoMedio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        if (capacidadeTanque > 0) {
            this.capacidadeTanque = capacidadeTanque;
        }
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        if (consumoMedio > 0) {
            this.consumoMedio = consumoMedio;
        }
    }

    public String getNomeClasse(){
        return this.getClass().getSimpleName();
    }

    public void exibirDados(){
        System.out.println("Tipo de veículo: "+getNomeClasse());
        System.out.println("Placa: "+getPlaca());
        System.out.println("Capacidade do tanque: "+getCapacidadeTanque());
        System.out.println("Consumo médio: "+getConsumoMedio());
    }

    public void verificaAutonomia(){
        double autonomia = this.getConsumoMedio() * this.getCapacidadeTanque();
        if (autonomia < 100){
            System.out.println("Alerta: abastecimento necessário");
        }else{
            System.out.println("Autonomia confortável: " + autonomia +"km");
        }
    }




}
