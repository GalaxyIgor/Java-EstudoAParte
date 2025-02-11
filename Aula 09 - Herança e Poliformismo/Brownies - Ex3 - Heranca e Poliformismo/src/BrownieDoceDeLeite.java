public class BrownieDoceDeLeite extends Brownie {

    public BrownieDoceDeLeite (String nome, double preco, String Sabor){
        super(nome, preco, Sabor);
    }

    public void addDoceDeLeite(){
        System.out.println("Adicionando doce de leite");
    }

    
    // override meio que pode printar algo na tela ou outra funcao de sua escolha ao mesmo tempo que é executado um metodo
    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Adicionando um brownie de doce de leite no carrinho de compras");
    }

}
