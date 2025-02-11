package br.inatelBank.Contas;

import br.inatelBank.Clientes.Cliente;

public class Conta1 {
    private float saldo;
    private float limite;

    Cliente conta1;
    Cliente conta2;
    

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void deposito(int valor) {
        this.saldo += valor;
    }

    public void sacar(int valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }
        else {
            System.out.println("Valor insuficiente");
        }
    }
    public float getLimite() {
        return limite;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }


}
