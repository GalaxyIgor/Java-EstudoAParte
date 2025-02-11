import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declara as variaveis
        int NP1, NP2, NP3;

        //nescessario para entrada
        Scanner sc = new Scanner(System.in);

        //mostra na tela "Digite o valor da NP1: "
        System.out.println("Digite o valor da NP1: ");
        //entrada NP1
        NP1 = sc.nextInt();

        //mostra na tela "Digite o valor da NP2: "
        System.out.println("Digite o valor do NP2: ");
        //entrada NP2
        NP2 = sc.nextInt();

        //soma o valor do total
        int total = NP1 + NP2;
        //faz a media
        int NFA = total/2;

        //if
        if (NFA < 60) {
            //mostra na tela "Digite o valor da NP3: "
            System.out.println("Digite o valor do NP3: ");
            //entrada NP3
            NP3 = sc.nextInt();

            //calcula a nota com np3
            int NFA2 = (NP3 + NFA) /2;
            //mostra os resultados
            System.out.println("Nota final: " + NFA2);
        }
        //else
        else{
            System.out.println("Nota final: " + NFA);
        }


        //fecha as entradas
        sc.close();
    }
}