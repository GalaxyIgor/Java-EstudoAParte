public class Main {
    public static void main(String[] args) {
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.vida = 100;
        z2.vida = 200;

        z1.nome = "Laura";
        z2.nome = "Ronaldo";

        System.out.println(z1.MostraVida());
        System.out.println(z2.MostraVida());

        z1.TransfereVida(z2, 100);

        System.out.println(z1.MostraVida());
        System.out.println(z2.MostraVida());

    }
}