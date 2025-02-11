package br.inatel.cdg.exercio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//esse codigo deve ser capaz de criar 5 numeros aleatorios e coloca na lista
//mostra na tela Antes da Ordenação e depois da ordenação
public class Main {
    public static void main(String[] args) {
        //cria o array de lista
        List<Double> listaDouble = new ArrayList<Double>();

        //criar 5 numeros aleatorios e coloca na lista
        for(int i = 0; i < 5; i++) {
            listaDouble.add(new Random().nextDouble()*100);
        }

        //mostra na tela Antes da Ordenação
        System.out.println("Antes da Ordenação:");

        //contador para detalhe
        int i = 1;
        //aqui ele mostra a lista em ordem crescente
        for (Double double1 : listaDouble) {
            System.out.println(i + " - " + double1);
            i++;
        }

        //Mostra na tela Depois da Ordenação
        System.out.println("\nDepois da Ordenação:");

        //aqui ele inverte a ordem da lista
        //obs: aqui esta o uso do collections Collections.reverseOrder()
        Collections.sort(listaDouble, Collections.reverseOrder());

        //contador para detalhe
        i = 1;
        //aqui ele mostra a lista em ordem decrescente
        for (Double double1 : listaDouble) {
            System.out.println(i + " - " + double1);
            i++;
        }
    }
}