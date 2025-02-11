
import java.util.Random;
import java.util.Scanner;

public class Main{


    public static void main(String args[]){
        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por Favor, Digite O Tamanho Do Campo!");

        System.out.print("Largura X: ");
        int tamanhocampoX = entrada.nextInt();
        System.out.print("Altura Y: ");
        int tamanhocampoY = entrada.nextInt();

        System.out.println("Ok, Analisando Informações...");
        System.out.println("Certo, Seu Campo Vai Ter " + tamanhocampoX + "x" + tamanhocampoY);

        boolean campoMinado[][] = new boolean[tamanhocampoX+1][tamanhocampoY+1];


        int posicaoMinaX = rand.nextInt(2);
        int posicaoMinaY = rand.nextInt(2);
        System.out.println("Bomba: "+posicaoMinaX + " - " +posicaoMinaY);

        campoMinado[posicaoMinaX][posicaoMinaY] = true;

        int posicaoXJogador, posicaoYJogador;

        System.out.println("Bem vindo ao Campo Minado!");

        //solucao utilizando for
        for (int i = 0; i < campoMinado.length*2; i++){
            System.out.print("Digite uma posicao X: ");
            posicaoXJogador = entrada.nextInt();
            System.out.print("Digite uma posicao Y: ");
            posicaoYJogador = entrada.nextInt();
            if(campoMinado[posicaoXJogador][posicaoYJogador]){
                System.out.println("EXPLODIU!");
            }else{
                System.out.println("SAFE!");
            }
        }

        System.out.println("Jogo Encerrado");
        entrada.close();

    }


}