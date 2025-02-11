import java.util.Random;
import java.util.Scanner;

public class CampoMinado {
    Random rand = new Random();
    Scanner entrada = new Scanner(System.in);
    int posicaoXJogador;
    int posicaoYJogador;
    boolean[][] campoMinado;

    // Método para definir o tamanho do campo minado e posicionar a mina
    void tamanhoCampoMinado() {
        System.out.println("Por favor, digite o tamanho do campo!");

        System.out.print("Largura X: ");
        int tamanhocampoX = entrada.nextInt();
        System.out.print("Altura Y: ");
        int tamanhocampoY = entrada.nextInt();

        System.out.println("Ok, analisando informações...");
        System.out.println("Certo, seu campo vai ter " + tamanhocampoX + "x" + tamanhocampoY);
        System.out.println("Bem-vindo ao Campo Minado!");

        campoMinado = new boolean[tamanhocampoX][tamanhocampoY];

        int posicaoMinaX = rand.nextInt(tamanhocampoX);
        int posicaoMinaY = rand.nextInt(tamanhocampoY);

        campoMinado[posicaoMinaX][posicaoMinaY] = true;

        System.out.println("Bomba posicionada! (para testes: " + posicaoMinaX + " - " + posicaoMinaY + ")");
    }

    // Método para jogar, utilizando um loop while
    void campoMinadoJogar() {
        boolean jogoAtivo = true;
        while (jogoAtivo) {
            System.out.print("Digite uma posição X: ");
            posicaoXJogador = entrada.nextInt();
            System.out.print("Digite uma posição Y: ");
            posicaoYJogador = entrada.nextInt();

            if (posicaoXJogador >= 0 && posicaoXJogador < campoMinado.length &&
                    posicaoYJogador >= 0 && posicaoYJogador < campoMinado[0].length) {

                if (campoMinado[posicaoXJogador][posicaoYJogador]) {
                    System.out.println("EXPLODIU! Game Over.");
                    jogoAtivo = false;  // Termina o jogo
                } else {
                    System.out.println("SAFE! Continue jogando.");
                }
            } else {
                System.out.println("Coordenadas fora do campo! Tente novamente.");
            }
        }

        closeScanner();
    }

    // Fechar o scanner ao terminar
    void closeScanner() {
        entrada.close();
    }
}

