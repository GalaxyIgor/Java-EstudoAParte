import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int lanche1, lanche2, lanche3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do lanche 1: ");
        lanche1 = sc.nextInt();
        System.out.println("Digite o valor do lanche 2: ");
        lanche2 = sc.nextInt();
        System.out.println("Digite o valor do lanche 3: ");
        lanche3 = sc.nextInt();

        int total = lanche1 + lanche2 + lanche3;
        int media = total/3;

        System.out.println("Total de lanches: " + total);
        System.out.println("Media: " + media);

        sc.close();
    }
}