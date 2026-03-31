public class Professor extends Pessoa {
    private String disciplina;
    public Professor(String disciplina) {
        super();
        this.disciplina = disciplina;
    }
    public Professor() {

    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    @Override
    public void setInfo(){
        super.setInfo();
        System.out.println("Disciplina: " + this.disciplina);
    }
    
}
