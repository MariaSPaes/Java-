package primeiroProjeto;

import java.util.Scanner;

public class Lista03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		// 1 - Resultado de dois números
		
		System.out.println();
		System.out.print("Informe um número: ");
		int num1, num2;
		num1 = scanner.nextInt ();
		System.out.print("Informe outro número: ");
		num2 = scanner.nextInt();
		double soma = num1 + num2;
		System.out.print("A soma é: " + soma);
		
		
		System.out.println("\n");
		
		
		// 2 - Divisão e Resto

		System.out.println();
		System.out.print("Informe um número: ");
		int num3, num4;
		num3 = scanner.nextInt ();
		System.out.print("Informe outro número: ");
		num4 = scanner.nextInt();
		double div = num3 / num4;
		double resto = num3 % num4;
		System.out.print("A divisão é: " + div);
		System.out.print("O resto da divisão é: " + resto);
		
		
		System.out.println("\n");
		
		// 3 - Perímetro de um triângulo
  
		System.out.println();
		double lado1, lado2, lado3;
		System.out.print("Informe um dos lados do triângulo: ");
		lado1 = scanner.nextInt(); 
		System.out.print("Informe outro lado do triângulo: ");
		lado2 = scanner.nextInt(); 
		System.out.print("Informe o último lado do triângulo: ");
		lado3 = scanner.nextInt(); 
		double perimetro = lado1 + lado2 + lado3;
		System.out.print("O perímetro do triângulo é: " + perimetro);
		
		System.out.println("\n");
		
		// 4 - Calculadora de Gorjeta
		
		System.out.println();
		System.out.print("Informe o valor da conta do restaurante: ");
		double conta, porgorjeta;
		conta =  scanner.nextDouble();
		System.out.print("Informe qual a porcentagem de gorjeta você deseja dar: ");
		porgorjeta = scanner.nextDouble();
		double gorjeta = conta * (porgorjeta/100);
		double total = conta + gorjeta;
		System.out.print("O valor total pago é: "+ total);
		
		System.out.print("\n");
		
		// 5 - Calculadora de área de círculo

		System.out.println(); 
		System.out.print("Informe o raio de um círculo (em metros): ");
		double raio;
		raio = scanner.nextDouble();
		double pi = 3.14159;
		double area = pi * raio * raio;
		System.out.print("A área do círculo é: " + area);
		
		System.out.print("\n");
		
		// 6 - Conversor de idade em dias

		System.out.println(); 
		System.out.print("Informe sua idade em anos, meses e dias: "); 
		double anos, meses, dias;
		System.out.print("Anos: ");
		anos = scanner.nextDouble();
		System.out.print("Meses: ");
		meses = scanner.nextDouble();
		System.out.print("Dias: ");
		dias = scanner.nextDouble();
		double totaldedias = (anos * 365) + (meses * 30) + dias;
		System.out.print("Você já viveu: " + totaldedias + " Dias"); 
		
		
		// 7 - Calculadora de pagamento por hora
		
		System.out.print("\n");
		System.out.println(); 
		System.out.print("Informe as horas trabalhadas: "); 
		double horas, pagamento;
		horas =  scanner.nextDouble();
		System.out.print("Agora, informe qual valor pago por hora: ");
		pagamento = scanner.nextDouble();
		double salario = horas * pagamento;
		double imposto = salario * 0.10;
		double salarioLiquido = salario - imposto;
		System.out.println("Seu salário bruto é: " + salario);
		System.out.print("Seu salário com impostos é: "+ salarioLiquido);
		
		
		
		
		
		
		

	}

}
