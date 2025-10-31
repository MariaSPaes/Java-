
public class ContaBancariaP {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Maria");

        conta.depositar(300);
        conta.sacar(100);

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}
