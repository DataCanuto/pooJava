public class Aluno extends Pessoa {
    private String curso;
    private double mensalidade;
    public Aluno(String curso, double mensalidade) {
        super();
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
    
    @Override
    public void setInfo(){
        super.setInfo();
        System.out.println("Curso: " + this.curso);
        System.out.println("Mensalidade: " + this.mensalidade);
    }
    
}
