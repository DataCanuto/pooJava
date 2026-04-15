public class Professor extends Pessoa {
    private String disciplina;
    public Professor(String nome, String sexo, int idade, String disciplina) {
        super(nome, sexo, idade);
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
