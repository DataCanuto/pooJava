public class Main {
    public static void main(String[] args) {
        /*Conta c = new Conta("Pedro",1000);
        System.out.println("Titular: " + c.getTitular());
        System.out.println("Saldo: " + c.getSaldo());
        c.sacar(300);
        System.out.println("Saldo após saque: " + c.getSaldo());
        c.depositar(400);
        System.out.println("Saldo após depósito: " + c.getSaldo());*/

        /*Corrente cc = new Corrente(500);
        cc.setTitular("Maria");
        cc.setSaldo(1000);
        System.out.println("Titular: " + cc.getTitular());
        System.out.println("Saldo: " + cc.getSaldo());
        System.out.println("Limite: " + cc.getLimite());

        cc.sacar(1700);
        
        System.out.println("Limite: " + cc.getLimite());
        System.out.println("Saldo: " + cc.getSaldo());*/

        Poupanca pp = new Poupanca(1, 0.02);
        pp.setTitular("João");
        pp.setSaldo(1000);
        System.out.println("Titular: " + pp.getTitular());
        System.out.println("Saldo: " + pp.getSaldo());      
        pp.depositar(500);
        System.out.println("Saldo após depósito: " + pp.getSaldo());
        pp.sacar(500);
        System.out.println("Saldo após saque: " + pp.getSaldo());
        


        

    }
}