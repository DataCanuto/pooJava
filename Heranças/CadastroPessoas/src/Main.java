
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        var option = 0;
        

        do{
            System.out.println("\n=======================================\n");
            System.out.println("Bem-vindo ao sistema de cadastro escolar!");
            System.out.println("Escolha uma opção:\n1 - Cadastrar novo CPF\n2 - Exibir pessoas\n3- Realizar matrícula\n4 - Registrar pagamento\n5 - Sair");
            option = scanner.nextInt();
            switch(option){
                case 1 -> add();
                case 2 -> exibirPessoas();
                case 3 -> menuMatricula();
                
                case 5 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opção inválida!");
            }
            
        } while(option != 5);

    }
    
    public static void add(){
        System.out.println("\n=======================================\n");
        System.out.println("Informe a categoria:\n1-Aluno\n2-Professor\n3-Funcionario\n4-Visitante");
        var option_classe = scanner.nextInt();
        switch(option_classe){
            case 1 ->{
                var aluno = new Aluno();
                System.out.println("Informe o nome do aluno:");
                aluno.setNome(scanner.next());
                System.out.println("Informe o sexo do aluno:");
                aluno.setSexo(scanner.next());
                System.out.println("Informe a idade do aluno:");
                aluno.setIdade(scanner.nextInt());
                System.out.println("Informe a matrícula do aluno:");
                aluno.setMatricula(scanner.next());
                scanner.nextLine(); // Consumir a quebra de linha pendente
                System.out.println("Informe o curso do aluno:");
                aluno.setCurso(scanner.nextLine());
                System.out.println("Informe a mensalidade do aluno:");
                aluno.setMensalidade(scanner.nextDouble());
                System.out.println("É bolsista? (1 - sim, 2 - não)");
                var option_bolsista = scanner.nextInt();
                switch(option_bolsista){
                    case 1 -> {
                        var bolsista = new Bolsista();
                        bolsista.setNome(aluno.getNome());
                        bolsista.setSexo(aluno.getSexo());
                        bolsista.setIdade(aluno.getIdade());
                        bolsista.setMatricula(aluno.getMatricula());
                        bolsista.setCurso(aluno.getCurso());
                        bolsista.setMensalidade(aluno.getMensalidade());
                        System.out.println("Informe o valor da bolsa:");
                        bolsista.setBolsa(scanner.nextDouble());
                        pessoas.add(bolsista);
                    }
                    case 2 -> {
                        aluno.setBolsista(false);
                        pessoas.add(aluno);
                    }
                }
            }

            case 2 -> {
                var professor = new Professor();
                System.out.println("Informe o nome do professor:");
                professor.setNome(scanner.next());
                System.out.println("Informe o sexo do professor:");
                professor.setSexo(scanner.next());
                System.out.println("Informe a idade do professor:");
                professor.setIdade(scanner.nextInt());
                System.out.println("Informe a disciplina do professor:");
                professor.setDisciplina(scanner.next());
                System.out.println("Informe o salário do professor:");
                professor.setSalario(scanner.nextDouble());
                pessoas.add(professor);
            }

            case 3 -> {
                var funcionario = new Funcionario();
                System.out.println("Informe o nome do funcionário:");
                funcionario.setNome(scanner.next());
                System.out.println("Informe o sexo do funcionário:");
                funcionario.setSexo(scanner.next());
                System.out.println("Informe a idade do funcionário:");
                funcionario.setIdade(scanner.nextInt());
                System.out.println("Informe o setor do funcionário:");
                funcionario.setSetor(scanner.next());
                System.out.println("Informe o cargo do funcionário:");
                funcionario.setCargo(scanner.next());
                System.out.println("Informe o salário do funcionário:");
                funcionario.setSalario(scanner.nextDouble());
                pessoas.add(funcionario);
            }

            case 4 -> {
                var visitante = new Visitante();
                System.out.println("Informe o nome do visitante:");
                visitante.setNome(scanner.next());
                System.out.println("Informe o sexo do visitante:");
                visitante.setSexo(scanner.next());
                System.out.println("Informe a idade do visitante:");
                visitante.setIdade(scanner.nextInt());
                pessoas.add(visitante);
            }

            default -> System.out.println("Opção inválida!");
        }
    }
    

    public static void exibirPessoas(){
        System.out.println("\n=======================================\n");
        System.out.println("Mostrando informações de todas as pessoas cadastradas:");
        System.out.println("Total de pessoas cadastradas: " + pessoas.size());
        System.out.println("1 - Alunos\n2 - Professores\n3 - Funcionários\n4 - Visitantes\n5 - Todos\n: ");
        var option_classe = scanner.nextInt();
        switch(option_classe){
            case 1 -> {
                System.out.println("Exibindo apenas alunos:");
                for (int i = 0; i<pessoas.size(); i++){
                    if(pessoas.get(i) instanceof Aluno){
                        pessoas.get(i).setInfo();
                    }
                }
            }

            case 2 -> {
                System.out.println("Exibindo apenas professores:");
                for (int i = 0; i<pessoas.size(); i++){
                    if(pessoas.get(i) instanceof Professor){
                        pessoas.get(i).setInfo();
                    }
                }
            }

            case 3 -> {
                System.out.println("Exibindo apenas funcionários:");
                for (int i = 0; i<pessoas.size(); i++){
                    if(pessoas.get(i) instanceof Funcionario){
                        pessoas.get(i).setInfo();
                    }
                }
            }

            case 4 -> {
                System.out.println("Exibindo apenas visitantes:");
                for (int i = 0; i<pessoas.size(); i++){
                    if(pessoas.get(i) instanceof Visitante){
                        pessoas.get(i).setInfo();
                    }
                }
            }

            case 5 -> {
                System.out.println("Exibindo todas as pessoas:");
                for (int i = 0; i<pessoas.size(); i++){
                    pessoas.get(i).setInfo();
                }
            }

            default -> System.out.println("Opção inválida!");
        }

        
        for (int i = 0; i<pessoas.size(); i++){
            pessoas.get(i).setInfo();
        }
    }

    public static void menuMatricula(){
        System.out.println("\n=======================================\n");
        System.out.println("Realizar matrícula:");
        System.out.println("Informe a matrícula do aluno:");
        var matricula = scanner.next();
        for (int i = 0; i < pessoas.size(); i++){
            if(pessoas.get(i) instanceof Aluno){
                var aluno = (Aluno) pessoas.get(i);
                if(aluno.verificarAluno(matricula)){
                    aluno.realizarMatricula();
                    return;                    
                }                
            }
        }

    }
}

