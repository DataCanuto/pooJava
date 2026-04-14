import java.util.Scanner;

public class Main {

    static Veiculo[] frota = new Veiculo[10];
    public static int contador = 0;
    static Scanner leitor = new Scanner(System.in);

    public static void menu(){
        System.out.println("Sistema de Gerenciamento de Frota");
        System.out.println("1 - Cadastrar Veículo");
        System.out.println("2 - Exibir informações");
        System.out.println("3 - Solicitar Manutenção");
        System.out.println("0 - Sair");
    }

    public static void add(){
        int opcao_classe = 0;
        String placa;
        double consumoMedio;
        double capacidadeTanque;

        for(int i = 0; i < frota.length; i++){
            System.out.println("Cadastro de Veículo");
            System.out.println("Informe a Classe:" +
                    "\n1 - Caminhão\n2 - Ônibus\n3 - Tratô");
            opcao_classe = leitor.nextInt();
            leitor.nextLine();

            switch(opcao_classe){
                case 1 ->
                        {

                            System.out.println("Informe a quantidade de eixos: ");
                            int eixos = leitor.nextInt();
                            leitor.nextLine();
                            frota[i] = new Caminhao(eixos);
                        }

                default -> frota[i] = new Veiculo();

            }


            System.out.println("Informe a placa do "+frota[i].getNomeClasse());
            placa = leitor.nextLine();
            frota[i].setPlaca(placa);
            System.out.println("Informe a capacidade do tanque em litros: ");
            capacidadeTanque = leitor.nextDouble();
            leitor.nextLine();
            frota[i].setCapacidadeTanque(capacidadeTanque);
            System.out.println("Informe o rendimento médio: ");
            consumoMedio = leitor.nextDouble();
            leitor.nextLine();
            frota[i].setConsumoMedio(consumoMedio);
            contador++;
            break;
        }
    }

    public static void exibir(){
        leitor.nextLine();
        System.out.println("Informe a placa do veículo: ");
        String placa = leitor.nextLine();
        for(int i = 0; i < frota.length; i++){
            if (frota[i].getPlaca().equals(placa)){
                frota[i].exibirDados();
            }else{
                System.out.println("Veículo não encontrado");
            }
        }
    }

    public static void manutencao(){
        System.out.println("Solicitar manutenção");
        System.out.println("\n1-Troca de Óleo\n2-Pneus\n3-Revisão Geral");
        int opcao_manutencao = leitor.nextInt();
        leitor.nextLine();
        switch(opcao_manutencao){
            case 1 -> System.out.println("Troca de oléo solicitada");
            case 2 -> System.out.println("Revisão nos pneus solicitada");
            case 3 -> System.out.println("Encaminhando para revisão geral");
            default -> System.out.println("Opção incorreta");
        }
    }



    public static void main(String[] args) {



        int opcao_menu = 0;
        do {
            menu();
            opcao_menu = leitor.nextInt();

            switch(opcao_menu){
                case 1 -> add();
                case 2 -> exibir();
                case 3-> manutencao();


            }
        } while(opcao_menu != 0);


    }


}
