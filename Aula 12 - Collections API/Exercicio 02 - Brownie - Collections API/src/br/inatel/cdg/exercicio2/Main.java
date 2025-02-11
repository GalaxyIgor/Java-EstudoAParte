package br.inatel.cdg.exercicio2;

//para poder acessar as outras classes
import br.inatel.cdg.exercicio2.brownie.Brownie;
import br.inatel.cdg.exercicio2.brownie.BrownieCafe;
import br.inatel.cdg.exercicio2.brownie.BrownieNutella;
import br.inatel.cdg.exercicio2.brownie.BrownieDoceDeLeite;


//para utilização do list e coollections
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //para criar uma lista de brownies
        List<Brownie> listaBrownie = new ArrayList<Brownie>();

        //criando cada config de brownie
        BrownieCafe bwCafe = new BrownieCafe("Brownie de Café", 10, "Café");
        BrownieNutella bwNutella = new BrownieNutella("Brownie de Nutella", 70, "Nutella");
        BrownieDoceDeLeite bwDoceLeite = new BrownieDoceDeLeite("Brownie Doce de Leite", 15, "Doce de leite");

        //adicionando cada brownie
        listaBrownie.add(bwCafe);
        listaBrownie.add(bwNutella);
        listaBrownie.add(bwDoceLeite);

        //mostrando o que foi adicionado antes da ordenação
        for (Brownie brownie : listaBrownie) {
            System.out.println(brownie.getNome() + " : " + brownie.getPreço());
        }

        // Ordena chamando o método sort (static)
        Collections.sort(listaBrownie);

        // mostrando o que foi adicionado depois da ordenação
        for (Brownie brownie : listaBrownie) {
            System.out.println(brownie.getNome() + " : " + brownie.getPreco());
        }

    }
}