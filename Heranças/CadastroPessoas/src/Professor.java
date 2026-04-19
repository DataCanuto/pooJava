public class Professor extends Pessoa {
    private String disciplina;
    private double salario;

    public Professor(String nome, String sexo, int idade, String disciplina, double salario) {
        super(nome, sexo, idade);
        this.disciplina = disciplina;
        this.salario = salario;
    }
    public Professor() {

    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
        
    public void receberSalario(){
        System.out.println(getNome() + " recebeu o salário de " + this.salario);
    }

    public void aumentarSalario(double percentual){
        this.salario += this.salario * percentual / 100;
        System.out.println(getNome() + " teve um aumento salarial de " + percentual + "%. Novo salário: " + this.salario);
    }
    
    @Override
    public void setInfo(){
        super.setInfo();
        System.out.println("Disciplina: " + this.disciplina);
        System.out.println("Salário: " + this.salario);
    }
    
}
