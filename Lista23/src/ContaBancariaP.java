
import java.util.Scanner;

public class ContaBancariaP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do titular da conta: ");
        String nome = sc.nextLine();

        ContaBancaria conta = new ContaBancaria(nome);

        System.out.print("Digite o valor do depósito: ");
        conta.depositar(sc.nextDouble());

        System.out.print("Digite o valor do saque: ");
        conta.sacar(sc.nextDouble());

        System.out.println("\nDados da conta:");
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo atual: " + conta.getSaldo());

        sc.close();
    }
}
