package sistemasafebankdigital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaSafeBankDigital {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Cartao> meusCartoes = new ArrayList<>();
    private static List<Conta> minhasContas = new ArrayList<>();
    

    public static void main(String[] args) {
        int op = -1;
        
        do{
            System.out.println("menu");
            System.out.println("1 - Cadastrar conta");
            System.out.println("5 - Mostrar contas");
            System.out.println("6 - Mostrar cartões");
            
            op = scanner.nextInt();
            
            switch(op){
                case 1 -> cadastrarConta();
                
                default -> System.out.println("Opção inválida");
                
            }
            
        }while(op!= 0);

    }
    
    public static void cadastrarConta(){        
        System.out.println("Informe o nome do titular: ");
        var nome = scanner.nextLine();
        Conta conta = new Conta(nome, 0, 123,4,98765);
        minhasContas.add(conta);        
    }
    
    public static boolean validarUsuario(String titular){
        for (int i = 0; i < minhasContas.size(); i++){
            if(titular.equals(minhasContas.get(i).getTitular())){
                return true;
            }
        }
        return false;
    }
    
    public static void cadastrarCartao(){
        System.out.println("Informe o nome do titular: ");
        var nome = scanner.nextLine();
        
        if(!validarUsuario(nome)){
            System.out.println("Usuário sem conta cadastrada");            
            return;        
        }else{
            System.out.println("Titular ");
        }        
        
            
        }
    }
    
    
    
}
