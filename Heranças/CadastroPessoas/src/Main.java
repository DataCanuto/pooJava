public class Main {
    public static void main(String[] args) {
        Pessoa Pedro = new Pessoa("Pedro", 25);
        Pedro.setInfo();

        System.out.println("-----------------------------");

        Funcionario jose = new Funcionario();
        jose.setNome("Jose");
        jose.setIdade(40);
        jose.setCargo("Diretor");
        jose.setSalario(10000);
        jose.setInfo();

        System.out.println("-----------------------------");

        Professor maria = new Professor();
        maria.setNome("Maria");
        maria.setIdade(35);
        maria.setDisciplina("Matemática");
        maria.setInfo();

        System.out.println("-----------------------------");

        Aluno joao = new Aluno();
        joao.setNome("João");
        joao.setIdade(20);
        joao.setCurso("Engenharia");
        joao.setMensalidade(1500);
        joao.setInfo();
        
        
    }
    
}
