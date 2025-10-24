import java.util.Scanner;

public class ContaBancariaP {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		ContaBancaria conta = new ContaBancaria();
		System.out.println("Digite o nome do titular da conta:");
		conta.titular = scanner.nextLine();

		conta.mostrarSaldo();
		System.out.println("Digite o valor para depósito:");
		double deposito = scanner.nextDouble();
		conta.depositar(deposito);

		conta.mostrarSaldo();

		System.out.println("Digite o valor para saque:");
		double saque = scanner.nextDouble();
		conta.sacar(saque);

		conta.mostrarSaldo();
	}



	}

