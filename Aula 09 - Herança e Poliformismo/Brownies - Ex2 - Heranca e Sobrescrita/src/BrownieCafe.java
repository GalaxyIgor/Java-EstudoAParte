//lembrar do extends
public class BrownieCafe extends Brownie{

    public BrownieCafe(String nome, double preco, String sabor) {
        //ficar experto com o super
        super(nome, preco, sabor);
    }

    public void addCafe(){
        System.out.println(super.nome + " adicionando mais café");
    }

    
    // override meio que pode printar algo na tela ou outra funcao de sua escolha ao mesmo tempo que é executado um metodo
    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Adicionando um brownie de café no carrinho de compras");
    }

}
