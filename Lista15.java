package primeiroProjeto;

import java.util.Scanner;

public class Lista15 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 1 - Criando um vetor
		String[] frutas = new String[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o nome da fruta " + (i + 1) + ": ");
			frutas[i] = scanner.next();
		}
		System.out.println("Frutas armazenadas:");
		for (int i = 0; i < 5; i++) {
			System.out.println(frutas[i]);
		}

		System.out.println("------------");

		// 2 - Vetor de números inteiros

		int[] numeros = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número inteiro (" + (i + 1) + "): ");
			numeros[i] = scanner.nextInt();
		}
		System.out.println("Números armazenados:");
		for (int i = 0; i < 10; i++) {
			System.out.println(numeros[i]);
		}

		System.out.println("------------");

		// 3 - Mostrando os valores na ordem inversa
		int[] numeros7 = new int[7];
		for (int i = 0; i < 7; i++) {
			System.out.println("Digite um número (" + (i + 1) + "): ");
			numeros7[i] = scanner.nextInt();
		}
		System.out.println("Valores na ordem inversa:");
		for (int i = 6; i >= 0; i--) {
			System.out.println(numeros7[i]);
		}

		System.out.println("------------");

		// 4 - Maiores que 100
		int[] numeros10 = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número (" + (i + 1) + "): ");
			numeros10[i] = scanner.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			if (numeros10[i] > 100) {
				System.out.println(numeros10[i] + " é maior do que 100");
			}
		}

		System.out.println("------------");

		// 5 - Procurando um valor no vetor
		int[] vetor8 = new int[8];
		for (int i = 0; i < 8; i++) {
			System.out.println("Digite um número (" + (i + 1) + "): ");
			vetor8[i] = scanner.nextInt();
		}
		System.out.println("Digite um número para procurar: ");
		int procurar = scanner.nextInt();
		boolean achou = false;
		for (int i = 0; i < 8; i++) {
			if (vetor8[i] == procurar) {
				achou = true;
				break;
			}
		}
		if (achou) {
			System.out.println("O número " + procurar + " existe no vetor!");
		} else {
			System.out.println("O número " + procurar + " não foi encontrado.");
		}

		System.out.println("------------");

		// 6 - Nome e idade de 5 pessoas
		String[] nomes = new String[5]; // Faltava essa linha!
		int[] idades = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o nome da pessoa " + (i + 1) + ": ");
			nomes[i] = scanner.next();
			System.out.println("Digite a idade de " + nomes[i] + ": ");
			idades[i] = scanner.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(nomes[i] + " tem " + idades[i] + " anos");
		}

		System.out.println("------------");


		// 7 - Identificação de idade

		int[] idade10 = new int[10];
		for (int i = 0; i < 10; i++) {
		    System.out.println("Digite a idade " + (i + 1) + ": ");
		    idade10[i] = scanner.nextInt();

		    if (idade10[i] < 18) {
		        System.out.println("você é menor de idade");
		    }
		}

		System.out.println("------------");

		// 8 - Aumento em massa
		double[] salarios = new double[7];
		for (int i = 0; i < 7; i++) {
		    System.out.println("Digite o salário da pessoa " + (i + 1) + ": ");
		    salarios[i] = scanner.nextDouble();

		    if (salarios[i] <= 2500) {
		        System.out.println("você receberá um aumento");
		    }
		}
	}
}
