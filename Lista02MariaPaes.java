package primeiroProjeto;

import java.util.Scanner;

public class Lista02MariaPaes {

	public static void main(String[] args) {
		
	
// 1 - Resultado de dois números
		Scanner scanner = new Scanner(System.in);
		int num1;
		int num2;
		System.out.println("Informe um número: ");
		num1 = scanner.nextInt ();
		System.out.println("Informe outro número (não pode ser zero): ");
		num2 = scanner.nextInt();
		double soma = num1 + num2;
		double sub = num1 - num2;
		double div = num1 / num2;
		double mult = num1 * num2;
		
		
		System.out.println("A soma é: " + soma);
		System.out.println("A subtração é: " + sub);
		System.out.println("A divisão é: " + div);
		System.out.println("A multiplicação é: " + mult);
		
		
		System.out.println("\n");
		
		
// 2 - Cálculo de temperatura
		
		double temp1;
		double temp2 = 1.8;
		System.out.println("Informe uma temperatura: ");
		temp1 = scanner.nextInt ();
	    double resultado = (temp1 * temp2) + 32;
	    System.out.println("A temperatura em fahrenheit é: " + resultado);
		
	    System.out.println("\n");
	    
		
// 3 - Conversão de valor

	    System.out.println("Conversão de dólar para real");
	    System.out.println();
	    System.out.println("Informe um valor em real: ");
	    double real;
	    real = scanner.nextDouble();
	    double dolar = 5.70;
	    double total = real / dolar;
	    System.out.println("O valor real convertido em dólar é: " + total);
		
	    System.out.println("\n");
	    
		
// 4 - Área do retângulo
	    
	    System.out.println("Informe a base do seu retângulo: ");
	    double base;
	    base = scanner.nextDouble ();
		System.out.println("Informe a altura do seu retângulo: ");
		double altura;
		altura = scanner.nextDouble ();
		double area = base * altura;
		System.out.println("Área do retângulo é: " + area);
		
		System.out.println("\n");
		
		
// 5 - Conversor de idade
       
	   System.out.println("Informe sua idade em anos: ");
	   int idade;
	   idade = scanner.nextInt();
	   int idadeMeses = idade * 12;
	   System.out.println("Você já viveu " + idadeMeses + " meses");
	   
	   System.out.println("\n");
	   
		
// 6 - Conversor de minutos para segundos
	   
	   System.out.println("Informe um tempo em minutos: ");
	   double minutos;
	   minutos = scanner.nextDouble ();
	   double segundos = minutos * 60;
	   System.out.println("Isso equivale a " + segundos + "segundos!");
	   
	   System.out.println("\n");
	   
	   
// 7 - Custo da compra	   
   
	   System.out.println("Informe o preço do produto: ");
	   double preco;
	   preco = scanner.nextDouble ();
	   System.out.println("Informe a quantidade de produtos comprados: ");
	   int quantidade;
	   quantidade = scanner.nextInt();
	   double total2 = preco * quantidade;
	   System.out.println("O total foi de: " + total2);
	   
	   System.out.println("\n");
	   

// 8 - Divisão de uma conta de restaurante
	   
	   System.out.println("Insira o total da conta do restaurante: ");
	   double conta1;
	   conta1 = scanner.nextDouble ();
	   System.out.println("Informe a quantidade de pessoas que vão dividir a conta: ");
	   int pessoas;
	   pessoas = scanner.nextInt();
	   double pagar = conta1 / pessoas;
	   System.out.println("Cada pessoa deve pagar R$: " + pagar);
	   
	   System.out.println("\n");
	   

// 9 - Cálculo de troco

	   System.out.println("Informe o valor da compra: ");
	   double compra1;
	   compra1 = scanner.nextDouble ();
	   System.out.println("Quanto o cliente pagou? ");
	   double cliente;
	   cliente = scanner.nextInt();
	   double troco = cliente - compra1;
	   System.out.println("O troco é R$: " + troco);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}

}
