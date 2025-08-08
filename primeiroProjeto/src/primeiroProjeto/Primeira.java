package primeiroProjeto;

import java.util.Scanner;

public class Primeira {

	public static void main(String[] args) {

		System.out.println("Olá Mundo");
		
		System.out.println("\n");
		
		//Declaração de variável
		int idade = 16;
		double salario = 2000.50;
		char letra = 'M';
		String nome = "Maria";
		boolean chuva = false;
		
		System.out.println(idade);
		System.out.println("O salário é: "+ salario);
		System.out.println("A letra é: "+ letra);
		System.out.println("O nome é: "+ nome);
		System.out.println(chuva);
		
		System.out.println("\n");

		//Operadores
		int num1 = 10;
		int num2 = 3;
		double soma = num1 + num2;
		double sub = num1 - num2;
		double div = num1 / num2;
		double mult = num1 * num2;
		double resto = num1 % num2;
		
		System.out.println("A soma é: " + soma);
		System.out.println("A subtração é: " + sub);
		System.out.println("A divisão é: " + div);
		System.out.println("A multiplicação é: " + mult);
		System.out.println("O resto é: " + resto);
		
		System.out.println("\n");
		
		//Entrada de Dados
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual é o seu nome? ");
		String nome1 = scanner.nextLine();
		System.out.println("Olá " + nome1 + " linda");
		
		System.out.println("\n");
		
		//Soma de dois números
		int numero1;
		int numero2;
		System.out.println("Informe um número: ");
		numero1 = scanner.nextInt ();
		System.out.println("Informe outro número: ");
		numero2 = scanner.nextInt();
		int soma1 = numero1 + numero2;
		System.out.println("O resultado é: " + soma1);
		
		System.out.println("\n");
		//Peça o ano de nascimento do usuário e mostre quantos anos ele tem
		
		int nasc1;
		int ano = 2025;
		System.out.println("Em qual ano você nasceu? ");
		nasc1 = scanner.nextInt();
		int idd1 = ano - nasc1;
		System.out.println("Você tem: " + idd1 + " anos de idade");
	
		System.out.println("\n");
		
		//Calcular desconto
		double preco;
		double desconto;
		System.out.println("Qual o valor da compra");
		preco = scanner.nextDouble();
		System.out.println("Qual o valor do desconto? ");
		desconto = scanner.nextDouble();
		double pagar = preco - desconto;
		System.out.println("Pague: " + pagar);
		
		System.out.println("\n");
		
		//Peça duas notas decimais para o usuário, calcule média e mostre
		
		double nota1;
		double nota2;
		System.out.println("Informe uma nota: ");
		nota1 = scanner.nextDouble();
		System.out.println("Informe outra nota: ");
		nota2 = scanner.nextDouble();
		double media = (nota1 + nota2) / 2;
		System.out.println("Média: " + media);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
