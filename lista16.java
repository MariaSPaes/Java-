package primeiroProjeto;

import java.util.Scanner;

public class lista16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 1 - Criando um vetor de cores
		String[] cores = new String[6];
		for (int i = 0; i < 6; i++) {
			System.out.println("Digite a cor[" + i + "]: ");
			cores[i] = scanner.next();
		}
		System.out.println("Mostrando as cores digitadas");
		for (int i = 0; i < 6; i++) {
			System.out.println("cores[" + i + "] = " + cores[i]);
		}

		System.out.println("----------------------");

		// 2 - Vetor de números decimais
		double[] numeros = new double[8];
		for (int i = 0; i < 8; i++) {
			System.out.println("Digite o número decimal[" + i + "]: ");
			numeros[i] = scanner.nextDouble();
		}
		System.out.println("Mostrando os números digitados");
		for (int i = 0; i < 8; i++) {
			System.out.println("numeros[" + i + "] = " + numeros[i]);
		}

		System.out.println("----------------------");

		// 3 - Mostrando apenas os pares
		int[] vetorPares = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o número[" + i + "]: ");
			vetorPares[i] = scanner.nextInt();
		}
		System.out.println("Mostrando apenas os pares");
		for (int i = 0; i < 10; i++) {
			if (vetorPares[i] % 2 == 0) {
				System.out.println("vetorPares[" + i + "] = " + vetorPares[i]);
			}
		}

		System.out.println("----------------------");

		// 4 - Menores que 50
		int[] menores = new int[12];
		for (int i = 0; i < 12; i++) {
			System.out.println("Digite o número[" + i + "]: ");
			menores[i] = scanner.nextInt();
		}
		System.out.println("Verificando menores que 50");
		for (int i = 0; i < 12; i++) {
			if (menores[i] < 50) {
				System.out.println("menores[" + i + "] = " + menores[i] + " -> menor que 50");
			}
		}

		System.out.println("----------------------");

		// 5 - Procurando um nome no vetor
		String[] nomes = new String[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o nome[" + i + "]: ");
			nomes[i] = scanner.next();
		}
		System.out.println("Digite um nome para procurar: ");
		String procurar = scanner.next();
		boolean encontrado = false;
		for (int i = 0; i < 5; i++) {
			if (nomes[i].equalsIgnoreCase(procurar)) {
				encontrado = true;
			}
		}
		if (encontrado) {
			System.out.println("Nome encontrado!");
		} else {
			System.out.println("Nome não encontrado!");
		}

		System.out.println("----------------------");

		// 6 - Produto e preço
		String[] produtos = new String[4];
		double[] precos = new double[4];
		for (int i = 0; i < 4; i++) {
			System.out.println("Digite o produto[" + i + "]: ");
			produtos[i] = scanner.next();
			System.out.println("Digite o preço do produto[" + i + "]: ");
			precos[i] = scanner.nextDouble();
		}
		System.out.println("Mostrando os produtos e preços");
		for (int i = 0; i < 4; i++) {
			System.out.println("O produto " + produtos[i] + " custa R$" + precos[i]);
		}

		System.out.println("----------------------");

		// 7 - Verificação de notas
		double[] notas = new double[6];
		for (int i = 0; i < 6; i++) {
			System.out.println("Digite a nota[" + i + "]: ");
			notas[i] = scanner.nextDouble();
		}
		System.out.println("Resultado dos alunos");
		for (int i = 0; i < 6; i++) {
			if (notas[i] < 6) {
				System.out.println("notas[" + i + "] = " + notas[i] + " -> aluno reprovado");
			} else if (notas[i] >= 6 && notas[i] <= 7) {
				System.out.println("notas[" + i + "] = " + notas[i] + " -> aluno em recuperação");
			} else {
				System.out.println("notas[" + i + "] = " + notas[i] + " -> aluno aprovado");
			}
		}

		System.out.println("----------------------");

		// 8 - Promoção de ingressos
		double[] ingressos = new double[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o preço do ingresso[" + i + "]: ");
			ingressos[i] = scanner.nextDouble();
		}
		System.out.println("Verificando promoções");
		for (int i = 0; i < 5; i++) {
			if (ingressos[i] > 100) {
				System.out
						.println("ingressos[" + i + "] = R$" + ingressos[i] + " -> Ingresso com promoção disponível!");
			} else {
				System.out.println("ingressos[" + i + "] = R$" + ingressos[i]);
			}
		}

	}

}
