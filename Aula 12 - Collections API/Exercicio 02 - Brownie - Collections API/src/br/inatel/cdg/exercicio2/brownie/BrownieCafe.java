package br.inatel.cdg.exercicio2.brownie;
public class BrownieCafe extends Brownie{
    public BrownieCafe(String nome, String sabor, int preço) {
        super(nome, sabor, preço);
    }

    @Override
    public int compareTo(Brownie o) {
        return Integer.compare(o.getPreço(),this.preço);
    }
}
