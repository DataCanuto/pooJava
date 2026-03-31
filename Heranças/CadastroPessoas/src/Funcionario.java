public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;
    public Funcionario(String cargo, double salario) {
        super();
        this.cargo = cargo;
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
    
    @Override
    public void setInfo(){
        super.setInfo();
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salário: " + this.salario);
    }
    
}
