public class Main {
    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi();
        zumbi1.name = "Kowalski";
        zumbi1.age = 21;
        zumbi1.Class = "Zumbi";

        Zumbi zumbi2 = new Zumbi();
        zumbi2.name = "Estovasky";
        zumbi2.age = 11;
        zumbi2.Class = "Zumbi";

        Zumbi Mahoraga = new Zumbi();
        Mahoraga.name = "Mahoraga";
        Mahoraga.age = 1000;
        Mahoraga.Class = "Boss";

        Humano humano1 = new Humano();
        humano1.name = "Cleusa";
        humano1.weight = 230;
        humano1.Class = "Humano";

        Humano Megumi = new Humano();
        Megumi.name = "Megumi";
        Megumi.weight = 235;
        Megumi.Class = "Megumi";
        Megumi.Class = "Full Shit";

        zumbi1.EatSomething();
        zumbi2.EatSomething();

        humano1.IsFood();
        Megumi.IsFood();
    }
}
