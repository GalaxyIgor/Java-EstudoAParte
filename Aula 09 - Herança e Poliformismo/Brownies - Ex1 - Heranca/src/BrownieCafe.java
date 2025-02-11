//lembrar do extends
public class BrownieCafe extends Brownie{

    public BrownieCafe(String nome, double preco, String sabor) {
        //ficar experto com o super
        super(nome, preco, sabor);
    }

    public void addCafe(){
        System.out.println(super.nome + " adicionando mais café");
    }

}
