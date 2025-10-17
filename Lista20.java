package primeiroProjeto;

import java.util.Scanner;

public class Lista20 {

	public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);
		
		saudacao();
		linha();
		retangulo();
		linha();
		cinco();
		linha();
		crescente();
		linha();
		meses();
		linha();
		
		System.out.println("Insira um número: ");
		int numero = scanner.nextInt();
		divisivel(numero);
		linha();
		
		System.out.println("Informe seu nome: ");
		String nome1 = scanner.next();
		nome(nome1);
		linha();
		
		System.out.println("Informe o primeiro nome: ");
		String nomes = scanner.next();
		System.out.println("Informe o sobrenome: ");
		String nomes2 = scanner.next();
		nomes(nomes, nomes2);
		linha();
		
		System.out.println("Informe um número: ");
		int numero1 = scanner.nextInt();
		num(numero1);
		linha();
		
		System.out.println("Informe a velocidade: ");
		int veloci = scanner.nextInt();
		velocidade(veloci);
		linha();
		
		System.out.println("Informe um dia da semana: ");
		String semana = scanner.next();
		semana(semana);
		linha();
		
		System.out.println("Informe a quantidade de itens: ");
		int estoque = scanner.nextInt();
		estoque(estoque);
		linha();
		
		

	}
	
	//FUNÇÃO SEM PARÂMETRO
	// 1 - Repetindo uma saudação
	public static void saudacao() {
		for (int i = 1; i<=5; i++) {
			System.out.println("Bom dia!");
		}
	}
	
	public static void linha() {
		System.out.println("------");
	}
	
	// 2 – Desenhando um retângulo
	public static void retangulo () {
		System.out.println("* * * * *");
		System.out.println("* * * * *");
		System.out.println("* * * * *");
	}
	
	
	// 3 – Imprimindo múltiplos de 5
	public static void cinco() {
		for (int i=5; i<=25;i+=5) {
			System.out.println(i);
		}
	}
	
	// 4 – Exibindo uma contagem crescente
	public static void crescente() {
		for (int i = 1; i<=8; i++) {
			System.out.println(i);
		}System.out.println("Pronto!");
	}
	
	// 5 – Mostrando os meses do ano
	public static void meses() {
		System.out.println("Janeiro");
		System.out.println("Fevereiro");
		System.out.println("Março");
		System.out.println("Abril");
		System.out.println("Maio");
		System.out.println("Junho");
	}
	
	//FUNÇÃO COM PARÂMETRO
	// 1 – Verificando divisibilidade
	public static void divisivel(int numero) {
		if (numero % 5 == 0) {
			System.out.println("O número "+numero+" é divisível.");
		} else {
			System.out.println("O número "+numero+" não é divisível.");
		}
	}
	
	// 2 – Mensagem de despedida
	public static void nome(String nome1) {
		System.out.println("Até logo, "+ nome1+"!");
	}
	
	// 3 – Unindo nomes
	public static void nomes(String nomes, String nomes2) {
		System.out.println(nomes+" " +  nomes2);
	}
	
	// 4 – Verificando maior que 100
	public static void num (int numero1) {
		if (numero1 >= 100) {
			System.out.println("O número "+numero1+" é maior que 100.");
		} else {
			System.out.println("O número "+numero1+" é menor que 100.");
		}
	}
	
	// 5 – Classificando velocidade
	public static void velocidade(int veloci) {
		if (veloci < 40) {
			System.out.println("Lenta");
		} else if (veloci > 40 && veloci < 80){
			System.out.println("Normal");
		} else if (veloci > 80){
			System.out.println("Rápida");
		}
	}
	
	// 6 – Saudação por dia da semana
	public static void semana(String semana) {
		System.out.println("Tenha uma ótima "+semana+"!");
	}
	
	// 7 – Verificando situação de estoque
	public static void estoque(int estoque) {
		if (estoque >= 10) {
			System.out.println("Estoque suficiente.");
		} else if (estoque >= 5 && estoque < 10){
			System.out.println("Estoque baixo.");
		} else if (estoque < 5){
			System.out.println("Estoque crítico.");
		}
	}}