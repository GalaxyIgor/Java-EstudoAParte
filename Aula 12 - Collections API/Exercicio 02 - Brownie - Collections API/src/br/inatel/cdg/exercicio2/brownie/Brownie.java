package br.inatel.cdg.exercicio2.brownie;
public abstract class Brownie implements Comparable<Brownie> {
    protected String nome;
    protected String sabor;
    protected int preço;

    public Brownie (String nome, String sabor, int preço) {
        this.nome = nome;
        this.sabor = sabor;
        this.preço = preço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getPreço() {
        return preço;
    }

    public void setPreço(int preço) {
        this.preço = preço;
    }
}
