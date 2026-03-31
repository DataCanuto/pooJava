//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Gato azula = new Gato();
        azula.especie = "British Short-Hair";
        azula.idade = 1;

        azula.emitirSom();

        azula.animalData();

        Cachorro borogodo = new Cachorro();
        borogodo.especie = "Caramelo";
        borogodo.idade = 7;

        borogodo.emitirSom();

        borogodo.animalData();




    }
}