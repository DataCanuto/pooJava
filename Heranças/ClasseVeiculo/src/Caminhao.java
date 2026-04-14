public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(){}

    public Caminhao(int eixos){
        super();
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }



    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Eixos: "+ getEixos());
    }

    @Override
    public void verificaAutonomia() {
        super.verificaAutonomia();
    }
}
