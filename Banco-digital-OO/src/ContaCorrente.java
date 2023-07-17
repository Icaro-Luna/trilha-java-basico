public class ContaCorrente extends Conta {

	private double limiteChequeEspecial;

	public ContaCorrente(Cliente cliente, double limiteChequeEspecial) {
		super(cliente);
		this.limiteChequeEspecial = limiteChequeEspecial;
	}

	public double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}

	@Override
	public void sacar(double valor) {
		if (valor <= saldo + limiteChequeEspecial) {
			saldo -= valor;
			System.out.println("Saque realizado com sucesso");
		} else {
			System.out.println("Saldo insuficiente");
		}
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		if (valor <= saldo + limiteChequeEspecial) {
			saldo -= valor;
			contaDestino.depositar(valor);
			System.out.println("Transferência realizada com sucesso");
		} else {
			System.out.println("Saldo insuficiente para realizar a transferência");
		}
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		imprimirInfosComuns();
		System.out.println(String.format("Limite Cheque Especial: %.2f", limiteChequeEspecial));
	}
}
