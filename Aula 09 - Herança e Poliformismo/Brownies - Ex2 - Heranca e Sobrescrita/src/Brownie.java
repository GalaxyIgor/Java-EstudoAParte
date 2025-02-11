//as subs/filhas classes so podem erdar dessa e de mais nenhuma
public class Brownie {

    //#protected é publico para erança, +public é para todas classes, -private para apenas a classe
    protected String nome;
    protected double preco;
    protected String sabor;

    //construtor
    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    //getters and setters

    public void addCarrinhoDeCompras(){
        System.out.println("Adicionando ao carrinho de compras: " + nome);
    }

    public void calculaValorTotalCompra(){
        System.out.println("Calculando o valor da compra de um: " + nome + ": " + preco);
    }

    public void mostraInformações(){
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Sabor: " + sabor);
        System.out.println("---------------------");
    }
}
