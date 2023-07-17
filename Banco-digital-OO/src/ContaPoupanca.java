public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		throw new UnsupportedOperationException("Transferência não é suportada em contas poupança.");
	}
}
