public class Main {
    public static void main(String[] args) {

        Aluno a[] = new Aluno[10];
        Bolsista b[] = new Bolsista[10];


        a[0] = new Aluno("Maria", "Feminino", 20, "Engenharia", 1500);
        a[1] = new Aluno("João", "Masculino", 22, "Medicina", 2000);
        b[0] = new Bolsista("Ana", "Feminino", 19, "Direito", 1800, 900);

        a[0].realizarMatricula();

        a[0].pagarMensalidade();       

        a[0].setInfo();

        

          
    }
    
}
