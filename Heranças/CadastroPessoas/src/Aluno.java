public class Aluno extends Pessoa {
    private String matricula;
    private String curso;
    private double mensalidade;
    private boolean status;
    private boolean bolsista;

    public Aluno(String matricula,String nome, String sexo, int idade, String curso, double mensalidade) {
        super(nome, sexo, idade);
        this.matricula = matricula;
        this.curso = curso;
        this.mensalidade = mensalidade;        
    }
    public Aluno() {

    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public boolean isBolsista() {
        return bolsista;
    }
    public void setBolsista(boolean bolsista) {
        this.bolsista = bolsista;
    }
    
    public boolean verificarAluno(String matricula){
        if(this.matricula.equals(matricula)){
            System.out.println("Aluno encontrado: " + getNome());
            setInfo();
            return true;
        } else {
            System.out.println("Aluno com matrícula " + matricula + " não encontrado.");
            return false;
        }
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
        System.out.println("Bolsista? " + isBolsista());
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
