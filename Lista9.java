package primeiroProjeto;

import java.util.Scanner;

public class Lista9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		
		// 1 - Contador:
		int cont = 1;
		while (cont <= 10) {
			System.out.println(cont);
			cont++;
		}
		
		System.out.println("\n");
		
		// 2 - Contagem regressiva:
		int numero2  = 10;
		while (numero2 >= 1) {
			System.out.println(numero2);
			numero2--;
		}
		
		System.out.println("\n");
		
		// 3 - Sequência numérica:
		int numero3 = 0;
		while (numero3 <= 100) {
			System.out.println(numero3);
			numero3 += 5;
		}
		
		System.out.println("\n");
		
		// 4 - Mostrando mensagem:
		int cinco = 1;
		while (cinco <= 5) {
			System.out.println("Eu gosto de Java");
			cinco++;
		}
		
		System.out.println("\n");
		
		// 5 - Soma de Números Digitados:
		int soma = 0;
		int contador = 1;
		while (contador <= 5) {
			System.out.print("Digite o número " + contador + ": ");
			int num = scanner.nextInt();
			soma += num;
			contador++;
		}
		System.out.println("Soma total = " + soma);
		
		System.out.println("\n");
		
		// 6 - Validação de Senha:
		int senha = 0;
		while (senha != 1234) {
			System.out.print("Digite a senha: ");
			senha = scanner.nextInt();
		}
		System.out.println("Senha correta!");
		
		System.out.println("\n");
		
		// 7 - Contagem Regressiva:
		System.out.print("Digite um número inteiro positivo: ");
		int numero7 = scanner.nextInt();
		while (numero7 >= 1) {
			System.out.println(numero7);
			numero7--;
		}
	}
	
	}


