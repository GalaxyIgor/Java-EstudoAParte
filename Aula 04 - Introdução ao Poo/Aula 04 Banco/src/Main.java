public class Main {
    public static void main(String[] args) {
        //criando uma instancia de conta!
        Conta conta = new Conta();
        conta.TitularDaConta = "Joaquina";
        conta.Saldo = 1000;
        conta.Limite = 2000;
        conta.NumeroDaConta = 1;

        //deposito
        conta.Deposito(10);
        System.out.println(conta.Saldo);

        //retirar
        conta.Retirar(10);
        System.out.println(conta.Saldo);

        System.out.println("Titular da Conta: " + conta.TitularDaConta + " Saldo: R$ " + conta.Saldo);
    }
}