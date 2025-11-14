
public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public double calcularRendimento() {
        return saldo * 0.05;
    }
}
