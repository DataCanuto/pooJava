public class Aluno extends Pessoa {
    private String curso;
    private double mensalidade;
    private boolean status;

    public Aluno(String nome, String sexo, int idade, String curso, double mensalidade) {
        super(nome, sexo, idade);
        this.curso = curso;
        this.mensalidade = mensalidade;        
    }
    public Aluno() {

    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public double getMensalidade() {
        return mensalidade;
    }
    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
    public boolean isStatus() {
        return status;
    }
    private void setStatus(boolean status) {
        this.status = status;
    }

    public void realizarMatricula(){
        if(!isStatus()){
            System.out.println("Matriculando " + getNome() + " no curso: " + this.curso);
            setStatus(true);
        }
    }

    public void cancelarMatricula(){
        if(isStatus()){
            System.out.println("Cancelando matrícula de " + getNome() + " no curso: " + this.curso);
            setStatus(false);
        }
    }

    public void pagarMensalidade(){
        if(isStatus()){
            System.out.println(getNome() + " pagou a mensalidade de " + this.mensalidade);
        } else {
            System.out.println(getNome() + " não está matriculado e não pode pagar a mensalidade.");
        }
    }
    
    @Override
    public void setInfo(){
        super.setInfo();
        if(isStatus()){
            System.out.println("Status: Matriculado");
            System.out.println("Curso: " + this.curso);
            System.out.println("Mensalidade: " + this.mensalidade);
        } else {
            System.out.println("Status: Não Matriculado");
        }        
    }

    public void fazerAniversario(){
        super.fazerAniversario();
        System.out.println("Feliz aniversário, " + getNome() + "! Aproveite seu dia!");
    }

    
}
