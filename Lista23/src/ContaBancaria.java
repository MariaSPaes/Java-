public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Depósito inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor <= saldo && valor > 0) {
            saldo -= valor;
        } else {
            System.out.println("Saque inválido!");
        }
    }
}
