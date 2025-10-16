package primeiroProjeto;

import java.util.Scanner;

public class Lista19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe um número: ");
		int numero = scanner.nextInt();
		valores(numero);
		separador1();

		System.out.println("Informe sua idade: ");
		int idade = scanner.nextInt();
		maioridade(idade);
		separador2();

		System.out.println("Informe seu nome: ");
		String mensagem = scanner.next();
		boasvindas(mensagem);
		separador3();

		System.out.println("Informe um valor: ");
		int num = scanner.nextInt();
		tabuada(num);
		separador4();

		System.out.println("Informe uma palavra: ");
		String peum = scanner.next();
		System.out.println("Informe outra palavra: ");
		String pdois = scanner.next();
		juntando(peum, pdois);
		separador5();

		System.out.println("Informe numero inteiro: ");
		int inteiro = scanner.nextInt();
		par(inteiro);
		separador6();

		System.out.println("Informe a temperatura: ");
		int temperatura = scanner.nextInt();
		grau(temperatura);
		separador7();

		System.out.println("Informe seu turno: ");
		String saud = scanner.next();
		turno(saud);
		separador8();
		
		System.out.println("Informe 3 valores para média: ");
		System.out.println("Valor 1: ");
		int n1= scanner.nextInt();
		System.out.println("Valor 2: ");
		int n2= scanner.nextInt();
		System.out.println("Valor 3: ");
		int n3= scanner.nextInt();
		media(n1,n2,n3);
		separador9();
		
		System.out.println("Informe a nota final do aluno: ");
		double notaFinal = scanner.nextDouble();
		aprovacao(notaFinal);
		separador10();


	}

	// 1 – Classificando valores
	public static void valores(int numero) {
		if (numero > 0) {
			System.out.println("O número é positivo.");
		} else if (numero == 0) {
			System.out.println("O número é zero.");
		} else {
			System.out.println("O número é negativo.");
		}
	}

	// separador
	public static void separador1() {
		System.out.println("-----------------------------------");
	}

	// 2 – Maioridade
	public static void maioridade(int idade) {
		if (idade >= 18) {
			System.out.println("Você é de maior.");
		} else {
			System.out.println("Você é de menor.");
		}
	}

	// separador
	public static void separador2() {
		System.out.println("-----------------------------------");
	}

	// 3 – Boas Vindas
	public static void boasvindas(String mensagem) {
		System.out.println("Seja bem vindo(a) " + mensagem);
	}

	// separador
	public static void separador3() {
		System.out.println("-----------------------------------");
	}

	// 4 – Tabuada 
	public static void tabuada(int num) {
		for (int i = 0; i <= 10; i++) {
			int tabuada1 = i * num;
			System.out.println(num + "x" + i + "=" + tabuada1);
		}
	}

	// separador
	public static void separador4() {
		System.out.println("-----------------------------------");
	}

	// 5 – Juntando palavras
	public static void juntando(String peum, String pdois) {
		System.out.println("Palavras juntas: " + peum + pdois);
	}

	// separador
	public static void separador5() {
		System.out.println("-----------------------------------");
	}

	// 6 – Verificando par ou ímpar
	public static void par(int inteiro) {
		if (inteiro % 2 == 0) {
			System.out.println("O número é par");
		} else {
			System.out.println("O número é impar.");
		}
	}

	// separador
	public static void separador6() {
		System.out.println("-----------------------------------");
	}

	// 7 – Classificando temperatura
	public static void grau(int temperatura) {
		if (temperatura < 15) {
			System.out.println("Frio.");
		} else if (temperatura > 15 && temperatura < 25) {
			System.out.println("Agradável.");
		} else {
			System.out.println("Quente.");
		}
	}

	// separador
	public static void separador7() {
		System.out.println("-----------------------------------");
	}

	// 8 – Saudação por turno
	public static void turno(String saud) {
		if (saud.equalsIgnoreCase("manhã")) {
			System.out.println("Bom dia!");
		} else if (saud.equalsIgnoreCase("tarde")) {
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Boa noite!");
		}
	}

	// separador
	public static void separador8() {
		System.out.println("-----------------------------------");
	}
	
	// 9 – Calculando média
	public static void media(int n1, int n2, int n3) {
		int media = ((n1 + n2 + n3) / 3);
		System.out.println("A média é: " +media);
	}
	
	// separador
		public static void separador9() {
			System.out.println("-----------------------------------");
		}

		// 10 – Verificando aprovação
		public static void aprovacao(double notaFinal) {
			if (notaFinal >= 7) {
				System.out.println("Aprovado!");
			} else if (notaFinal >= 5 && notaFinal < 7) {
				System.out.println("Em recuperação.");
			} else {
				System.out.println("Reprovado.");
			}
		}
		
		public static void separador10() {
			System.out.println("-----------------------------------");
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


