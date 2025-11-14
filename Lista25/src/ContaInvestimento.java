
public class ContaInvestimento extends Conta {

	public ContaInvestimento(double saldo) {
		super(saldo);
	}

	@Override
	public double calcularRendimento() {
		return saldo * 0.10;
	}
}
