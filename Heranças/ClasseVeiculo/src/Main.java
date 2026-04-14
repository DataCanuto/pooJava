//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

void main() {

    Caminhao teste = new Caminhao(2);
    teste.setPlaca("ABC-8N22");
    teste.setCapacidadeTanque(20.00);
    teste.setConsumoMedio(10.00);

    teste.exibirDados();

    System.out.println("\n --- \n");

    teste.verificaAutonomia();

    System.out.println("\n --- \n");

    Scanner leitor = new Scanner(System.in);

    System.out.println("\t -- Menu de Manutenção -- \n" +
                "1 - Troca de Óleo\n" +
                "2 - Pneus\n" +
                "3 - Revisão Geral\n" +
            "Informe a opção desejada: ");

    int op = leitor.nextInt();

    switch(op){
        case 1 -> System.out.println("Troca de oléo agendada para o veículo de placa " + teste.getPlaca());
        case 2 -> System.out.println("Troca de pneus agendada para o veóculo de placa " + teste.getPlaca());
        case 3 -> System.out.println("Revisão geral agendada para veículo de placa " + teste.getPlaca());
        default -> System.out.println("Opção" + op + " inválida, tente novamente");
    }






}
