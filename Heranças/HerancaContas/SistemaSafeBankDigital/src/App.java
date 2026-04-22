
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static Scanner scanner = new Scanner(System.in);
    public static List<Cartao> cartoes = new ArrayList<>();
    public static List<Conta> contas = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        do { 
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha pendente
            switch (opcao) {
                case 1 -> cadastrarConta();
                case 2 -> cadastrarCartao();
                case 3 -> exibirContas();
                case 4 -> exibirCartoes();
                case 5 -> {
                    System.out.println("Saindo...");
                    return;
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (true);
        
    }


    public static boolean validarConta(String titular) {        
        for (Conta conta : contas) {
            if (conta.getTitular().equals(titular)){
                return true;
            }
        }
        return false;
    }

    public static List<String> bandeirasAceitas = List.of("VISA", "MASTERCARD", "ELO");

    public static boolean verificarBandeira(String bandeira) {
        if (bandeirasAceitas.contains(bandeira)){
            System.out.println("Bandeira aceita.");
            return true;
        } else {           
            return false;
        }
    }

    public static boolean validarSenhaCartao(int senha) {
        if (String.valueOf(senha).length() != 4) {
            System.out.println("Senha deve conter exatamente 4 dígitos.");
            return false;
        }
        return true;
    }


    public static void cadastrarCartao() {
        Cartao cartao = new Cartao();

        System.out.println("\n==Cadastro de Cartão==");
        System.out.println("1. Informe o nome do titular do cartão: ");
        String titular = scanner.nextLine();
        if(!validarConta(titular)){
            System.out.println("Titular não encontrado. Por favor, cadastre uma conta primeiro.");
            return;
        }else{
            System.out.println("Seja bem vindo(a) " + titular + "! Vamos cadastrar seu cartão.");
            for(int i = 0; i < contas.size(); i++){
                if(contas.get(i).getTitular().equals(titular)){
                    cartao.setConta(contas.get(i));
                    break;
                }
            }
        }
        cartao.setTitular(cartao.getConta().getTitular());
        cartao.setSaldo(cartao.getConta().getSaldo());
        

        int bandeiraOp = 0;
        String bandeira = "";
        do{
            System.out.println("2. Informe a bandeira do cartão: \n1 - VISA, 2 - MASTERCARD, 3 - ELO");
            bandeiraOp = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha pendente
            bandeira = switch(bandeiraOp) {
                case 1 -> bandeirasAceitas.get(0); // "VISA"
                case 2 -> bandeirasAceitas.get(1); // "MASTERCARD"
                case 3 -> bandeirasAceitas.get(2); // "ELO"
                default -> "Bandeira inválida";
            };
            cartao.setBandeira(bandeira);
        } while (false);

        do {
            System.out.println("3. Informe a senha do cartao (4 digitos)");
            int senha = scanner.nextInt();
            if(validarSenhaCartao(senha)){
                cartao.setSenha(senha);
                break;
            } else {
                System.out.println("Senha invalida. Por favor, tente novamente.");
            }
        } while (false);
        cartao.setNumeroCartao(bandeiraOp, "789456123");
        cartoes.add(cartao);
        System.out.println("Deseja habilitar a função de crédito? (S/N)");
        String opcaoCredito = scanner.nextLine();
        switch (opcaoCredito.toUpperCase()) {
            case "S" -> {
                Credito credito = new Credito(cartao.getTitular(), cartao.getNumeroCartao(), cartao.getBandeira(), cartao.getSenha(), cartao.getConta(), cartao.getSaldo());
                System.out.println("Função de crédito habilitada com sucesso!");
                System.out.println("Defina um limite de crédito para o cartão: ");
                double limite = scanner.nextDouble();
                credito.setLimite(limite);
            }
            case "N" -> {
                Debito debito = new Debito(cartao.getTitular(), cartao.getNumeroCartao(), cartao.getBandeira(), cartao.getSenha(), cartao.getConta(), cartao.getSaldo());
                System.out.println("Função de crédito não habilitada.");
            }
            default -> System.out.println("Opção inválida. Função de crédito não habilitada.");
        }
    }

    public static void cadastrarConta(){
        
        System.out.println("\n==Seja bem vindo(a) a agência 1234==");
        System.out.println("1. Informe nome do novo titular: ");
        String titular = scanner.nextLine();
        System.out.println("3. Informe o valor do depósito inicial: ");
        double depositoInicial = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha pendente
        System.out.println("4. Informe a senha da conta: ");
        String senha = scanner.nextLine();
        System.out.println("5. Gostaria de abrir uma conta poupança? (S/N)");
        String opcaoPoupanca = scanner.nextLine();
        switch (opcaoPoupanca.toUpperCase()) {
            case "S" ->{
                System.out.println("Conta poupança aberta com sucesso!");
                Poupanca novaPoupanca = new Poupanca(titular, "1234", "5678-9", depositoInicial, senha);
                novaPoupanca.setId(contas.size() + 1);
                contas.add(novaPoupanca);
            }
            case "N" -> {
                System.out.println("Conta corrente aberta com sucesso!");
                Corrente novaCorrente = new Corrente(titular, "1234", "5678-9", depositoInicial, senha);
                novaCorrente.setId(contas.size() + 1);
                contas.add(novaCorrente);
            }
            default -> {
                System.out.println("Opção inválida. Tente novamente.");
                
            }
        }        
    }

    public static void exibirMenu() {
        System.out.println("\n==Menu Principal==");
        System.out.println("1. Cadastrar Conta");
        System.out.println("2. Cadastrar Cartão");
        System.out.println("3. Exibir Contas");
        System.out.println("4. Exibir Cartões");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void exibirContas() {
        System.out.println("\n==Contas Cadastradas==");
        for (Conta conta : contas) {
            System.out.println("ID: " + conta.getId() + ", Titular: " + conta.getTitular() + ", Agência: " + conta.getAgencia() + ", Número da Conta: " + conta.getNumeroConta() + ", Saldo: " + conta.getSaldo()+
        ", Tipo da conta: " + (conta instanceof Poupanca ? "Poupança" : "Corrente"));
        }   
    }

    public static void exibirCartoes() {
        System.out.println("\n==Cartões Cadastrados==");
        for (Cartao cartao : cartoes) {
            System.out.println("Titular: " + cartao.getTitular() + ", Número do Cartão: " + cartao.getNumeroCartao() + ", Bandeira: " + cartao.getBandeira() + ", Saldo: " + cartao.getSaldo() + ", Dados da conta vinculada: " + cartao.getConta().getTitular() + ", Agência: " + cartao.getConta().getAgencia() + ", Número da Conta: " + cartao.getConta().getNumeroConta() + ", Saldo: " + cartao.getConta().getSaldo()+
        ", Tipo do cartão: " + (cartao instanceof Credito ? "Crédito" : "Débito"));
        }
    }

}
