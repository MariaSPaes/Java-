package primeiroProjeto;

import java.util.Scanner;

public class Lista18 {

	public static void main(String[] args) {

		nome();
		separador();
		frase();
		separador();
		contagem();
		separador();
		vogais();
		separador();
		quadradinho();
		separador();
		pares();
		separador();
		regressiva();
		separador();
		triangulo();
		separador();
		dias();

	}

	public static void separador() {
		System.out.println("-----------------------------------");
	}

	// 1 – Apresentação
	public static void nome() {
		for (int a = 0; a <= 100; a++) {
			System.out.println("duda");
		}

	}

	// 2 – Exibindo uma frase
	public static void frase() {
		for (int f = 1; f <= 1; f++) {
			System.out.println("Confie no seu potencial!");
		}

	}

	// 3 – Imprimindo valores
	public static void contagem() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);

		}
	}

	// 4 – Mostrando as vogais
	public static void vogais() {
		System.out.println("a");
		System.out.println("e");
		System.out.println("i");
		System.out.println("o");
		System.out.println("u");
	}

	// 5 – Desenhando um quadrado
	public static void quadradinho() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	// 6 – Imprimindo números pares
	public static void pares() {
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println("Os números pares de 2 a 20 são: " + i);
			}
		}
	}

	// 7 – Exibindo uma contagem regressiva
	public static void regressiva() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("Fim");
	}

	// 8 – Desenhando um triângulo
	public static void triangulo() {
		System.out.println("    *");
		System.out.println("   ***");
		System.out.println("  *****");
		System.out.println(" *******");
		System.out.println("*********");
	}

	

	// 9 – Mostrando os dias da semana
	public static void dias() {
		System.out.println("Domingo");
		System.out.println("Segunda");
		System.out.println("Terça");
		System.out.println("Quarta");
		System.out.println("Quinta");
		System.out.println("Sexta");
		System.out.println("Sábado");
	}
}