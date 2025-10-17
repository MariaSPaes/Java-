package primeiroProjeto;

import java.util.Scanner;

public class Lista21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 1
		System.out.println("Digite o primeiro número para somar: ");
		int n1 = scanner.nextInt();
		System.out.println("Digite o segundo número: ");
		int n2 = scanner.nextInt();
		System.out.println("Soma: " + somar(n1, n2));
		System.out.println(linha());

		// 2
		System.out.println("Digite o primeiro número para subtrair: ");
		int s1 = scanner.nextInt();
		System.out.println("Digite o segundo número: ");
		int s2 = scanner.nextInt();
		System.out.println("Subtração: " + subtrair(s1, s2));
		System.out.println(linha());

		// 3
		System.out.println("Digite o primeiro número para multiplicar: ");
		int m1 = scanner.nextInt();
		System.out.println("Digite o segundo número: ");
		int m2 = scanner.nextInt();
		System.out.println("Multiplicação: " + multiplicar(m1, m2));
		System.out.println(linha());

		// 4
		System.out.println("Digite o primeiro número para dividir: ");
		int d1 = scanner.nextInt();
		System.out.println("Digite o segundo número: ");
		int d2 = scanner.nextInt();
		System.out.println(dividir(d1, d2));
		System.out.println(linha());

		// 5
		System.out.println("Digite a primeira nota: ");
		double nota1 = scanner.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = scanner.nextDouble();
		System.out.println("Média: " + calcularMedia(nota1, nota2));
		System.out.println(linha());

		// 6
		System.out.println("Digite a primeira nota: ");
		double na1 = scanner.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double na2 = scanner.nextDouble();
		System.out.println("Resultado: " + verificarAprovacao(na1, na2));
		System.out.println(linha());

		// 7
		System.out.println("Digite o primeiro número: ");
		int maior1 = scanner.nextInt();
		System.out.println("Digite o segundo número: ");
		int maior2 = scanner.nextInt();
		System.out.println(maiorNumero(maior1, maior2));
		System.out.println(linha());

		// 8
		System.out.println("Digite a temperatura em Celsius: ");
		double celsius = scanner.nextDouble();
		System.out.println("Temperatura em Fahrenheit: " + converterCelsiusParaFahrenheit(celsius));
		System.out.println(linha());

		// 9
		System.out.println("Digite a base do retângulo: ");
		double base = scanner.nextDouble();
		System.out.println("Digite a altura do retângulo: ");
		double altura = scanner.nextDouble();
		System.out.println("Área: " + calcularAreaRetangulo(base, altura));
		System.out.println(linha());

		// 10
		scanner.nextLine(); // limpar o Enter anterior
		System.out.println("Digite seu nome: ");
		String nome = scanner.nextLine();
		System.out.println(gerarMensagem(nome));
		System.out.println(linha());

		// 11
		System.out.println("Digite o primeiro nome: ");
		String nome1 = scanner.nextLine();
		System.out.println("Digite o segundo nome: ");
		String nome2 = scanner.nextLine();
		System.out.println("Resultado: " + juntarNomes(nome1, nome2));
		System.out.println(linha());

		// 12
		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();
		System.out.println("Classificação: " + avaliarIdade(idade));
		System.out.println(linha());

		scanner.close();
	}

	public static String linha() {
		return "----------------------";
	}

	public static int somar(int a, int b) {
		return a + b;
	}

	public static int subtrair(int a, int b) {
		return a - b;
	}

	public static int multiplicar(int a, int b) {
		return a * b;
	}

	public static String dividir(int a, int b) {
		if (b == 0) {
			return "Não é possível dividir por 0";
		} else {
			return "Resultado: " + (a / b);
		}
	}

	public static double calcularMedia(double n1, double n2) {
		return (n1 + n2) / 2;
	}

	public static String verificarAprovacao(double n1, double n2) {
		double media = calcularMedia(n1, n2);
		if (media >= 6) {
			return "Aprovado";
		} else {
			return "Reprovado";
		}
	}

	public static String maiorNumero(int a, int b) {
		if (a > b) {
			return "Maior número: " + a;
		} else if (b > a) {
			return "Maior número: " + b;
		} else {
			return "Eles são iguais";
		}
	}

	public static double converterCelsiusParaFahrenheit(double celsius) {
		return (celsius * 9 / 5) + 32;
	}

	public static double calcularAreaRetangulo(double base, double altura) {
		return base * altura;
	}

	public static String gerarMensagem(String nome) {
		return "Olá, " + nome + "!";
	}

	public static String juntarNomes(String nome1, String nome2) {
		return nome1 + " " + nome2;
	}

	public static String avaliarIdade(int idade) {
		if (idade < 12) {
			return "Criança";
		} else if (idade < 18) {
			return "Adolescente";
		} else if (idade < 60) {
			return "Adulto";
		} else {
			return "Idoso";
		}
	}
}
