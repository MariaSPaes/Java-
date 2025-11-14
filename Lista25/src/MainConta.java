import java.util.Scanner;

public class MainConta {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Escolha o tipo de conta:");
        System.out.println("1 - Conta Poupança");
        System.out.println("2 - Conta Investimento");
        System.out.print("Opção: ");
        int opc = sc.nextInt();

        Conta conta;

        if (opc == 1) conta = new ContaPoupanca(saldo);
        else conta = new ContaInvestimento(saldo);

        System.out.println("Rendimento: R$ " + conta.calcularRendimento());
    }
}