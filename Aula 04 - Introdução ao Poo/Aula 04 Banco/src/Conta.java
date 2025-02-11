public class Conta {
    //Dados do Cliente
    float Saldo;
    float Limite;
    int NumeroDaConta;
    String TitularDaConta;

    //Metodos
    void Deposito(int i) {
        Saldo = Saldo + Limite;
    }
    void Retirar(int i) {
        Saldo = Saldo - Limite;
    }
}
