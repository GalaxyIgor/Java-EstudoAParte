//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Pessoa p1 = new Pessoa("Capiroto");
        Pessoa p2 = new Pessoa("Tinhoso, 56");

        Bloco bloco1 = new Bloco();
        Bloco bloco2 = new Bloco();

        System.out.println(Bloco.getNumBlocos());
    }
}