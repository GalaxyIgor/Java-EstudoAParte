public class BrownieNutella extends Brownie{

    public BrownieNutella(String nome, double preco, String sabor) {

        super(nome, preco, sabor);
    }

    public void addNutella(){
        System.out.println(super.nome + " adicionando mais Nutella");
    }

}
