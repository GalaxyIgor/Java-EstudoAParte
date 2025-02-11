package br.inatel.cdg;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Tio", 4321);
        Cliente cliente2 = new Cliente("Tia", 1234);

        Conta conta = new Conta(100, 100);

        conta.sacar(300);

        System.out.println("Fim da Main");

    }

}