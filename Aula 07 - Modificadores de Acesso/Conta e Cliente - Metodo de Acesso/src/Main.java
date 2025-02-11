import br.inatelBank.Contas.Conta1;

public class Main {
    public static void main(String[] args) {
        Conta1 conta = new Conta1();
        //conta.saldo = 1000; invalido
        conta.deposito(1000);

        //get saldo mostra
        System.out.println("Saldo atual: " + conta.getSaldo());

    }
}