package primeiroProjeto;

import java.util.Scanner;

public class lista17 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 1 – Criando uma matriz simples

		int[][] matriz1 = new int[2][3];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Digite numeros [" + i + "][" + j + "]:");
				matriz1[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Matriz 2x3:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		// 2 – Nomes em uma tabela

		String[][] nomes = new String[3][2];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("Digite nomes[" + i + "][" + j + "]:");
				nomes[i][j] = scanner.nextLine();
			}
		}
		System.out.println("Tabela de nomes 3x2:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(nomes[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println();

		// 3 – Mostrando a diagonal principal
		int[][] num = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Digite um numero[" + i + "][" + j + "]:");
				num[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Diagonal principal:");
		for (int i = 0; i < 3; i++) {
			System.out.println("num[" + i + "][" + i + "] = " + num[i][i]);
		}

		System.out.println();

		// 4 – Procurando um número
		int[][] matriz4 = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Preencha a matriz com números[" + i + "][" + j + "]:");
				matriz4[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Digite um número para procurar:");
		int numero = scanner.nextInt();
		boolean encontrado = false;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (matriz4[i][j] == numero) {
					System.out.println("Número encontrado na posição [" + i + "][" + j + "]");
					encontrado = true;
				}
			}
		}
		if (!encontrado) {
			System.out.println("Número não encontrado na matriz.");
		}

		System.out.println();

		// 5 – Elementos maiores que 10
		int[][] matriz5 = new int[4][3];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Digite matriz5[" + i + "][" + j + "]:");
				matriz5[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Elementos maiores que 10:");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				if (matriz5[i][j] > 10) {
					System.out.println("matriz5[" + i + "][" + j + "] = " + matriz5[i][j]);
				}
			}
		}
	}
}
