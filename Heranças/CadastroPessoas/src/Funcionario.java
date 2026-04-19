public class Funcionario extends Pessoa {
    private String cargo;
    private String setor;
    private double salario;    

    public Funcionario(String nome, int idade, String sexo, String cargo, String setor, double salario) {
        super(nome, sexo, idade);
        this.cargo = cargo;
        this.setor = setor;
        this.salario = salario;
    }
    public Funcionario() {

    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }

    
    @Override
    public void setInfo(){
        super.setInfo();
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salário: " + this.salario);
    }
    
}
