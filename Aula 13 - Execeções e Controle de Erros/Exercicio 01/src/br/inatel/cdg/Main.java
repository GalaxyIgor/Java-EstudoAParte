package br.inatel.cdg;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Tio", 4321);
		Cliente cliente2 = new Cliente("Tia", 1234);
        //possivel erro de nullpointerexception
		Cliente cliente3 = null;
		
		Conta conta = new Conta(1500, 500);

		conta.addCliente(cliente1);
		conta.addCliente(cliente2);
        //add o tratamento de erro
		conta.addCliente(cliente3);
		
		conta.mostraInfo();

		System.out.println("Fim da Main");
		
	}

}