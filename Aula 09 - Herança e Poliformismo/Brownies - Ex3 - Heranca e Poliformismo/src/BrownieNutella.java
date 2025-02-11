public class BrownieNutella extends Brownie{

    public BrownieNutella(String nome, double preco, String sabor) {

        super(nome, preco, sabor);
    }

    public void addNutella(){
        System.out.println(super.nome + " adicionando mais Nutella");
    }

    // override meio que pode printar algo na tela ou outra funcao de sua escolha ao mesmo tempo que é executado um metodo
    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Adicionando um brownie de Nutella no carrinho de compras");
    }
}
