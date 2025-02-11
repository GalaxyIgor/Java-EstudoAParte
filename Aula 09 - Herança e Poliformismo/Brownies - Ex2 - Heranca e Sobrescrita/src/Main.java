public class Main {
    //setas são heranças
    public static void main(String[] args) {
        //trazendo as heranças obs:(não trazer brownies)
        BrownieCafe bwCafe = new BrownieCafe("Brownie de Café",10,"Café");
        BrownieNutella bwNutella = new BrownieNutella("Brownie de Nutella",70,"Nutella");
        BrownieDoceDeLeite bwDoceDeLeite = new BrownieDoceDeLeite("Brownie Doce De Leite", 100,"Doce De Leite");

        
        System.out.println("======================");
        System.out.println("Ações:");
        //add no carrinho de compra
        bwNutella.addCarrinhoDeCompras();
        bwCafe.addCarrinhoDeCompras();

        //add mais cafe (tipo uma observação)
        bwCafe.addCafe();

        //array
        Brownie[] bns = new Brownie[10];
        bns[0] = bwCafe;
        bns[1] = bwNutella;
        bns[2] = bwDoceDeLeite;

        // Para mostrar as informações de cada Brownie
        System.out.println("======================");
        for (int i = 0; i < bns.length; i++) {
            if (bns[i] != null) {
                bns[i].mostraInformações();
            }
        }
        System.out.println("======================");
    }
}