
public class Main {

	public static void main(String[] args) {
		Cliente daniel = new Cliente();
		daniel.setNome("daniel");

		Conta cc = new ContaCorrente(daniel);
		Conta poupanca = new ContaPoupanca(daniel);

		cc.depositar(1000);
		cc.transferir(500, poupanca);

		// poupanca.depositar(10000);
		// poupanca.transferir(500, cc);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
