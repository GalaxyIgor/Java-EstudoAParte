public class Zumbi {
    double vida;
    String nome;

    double MostraVida() {
        return this.vida;
    }

    void TransfereVida(Zumbi zumbiAlvo, double quantidade) {
        this.vida -= quantidade;
        zumbiAlvo.vida += quantidade;
    }
}