package primeiroProjeto;

import java.util.Scanner;

public class Lista4 {

	public static void main(String[] args) {

		Scanner scanner =  new Scanner(System.in);
		
		
		// 1 - Verificar maioridade

		System.out.print("Qual sua idade?");
		int idade;
		idade = scanner.nextInt ();
		if(idade >= 18) {
			System.out.println("Você é maior de idade!");
		} else {
			System.out.println("Você tem " + idade + " anos e é menor de idade.");
		}
		
		System.out.println("\n");
		
		
		// 2 - Comparar dois números

		double num1, num2;
		System.out.print("Informe um número: ");
		num1 = scanner.nextDouble ();
		System.out.print("Informe outro número: ");
		num2 = scanner.nextDouble ();
		if(num1 > num2) {
			System.out.println("O primeiro número é maior");
		} else {
			System.out.println("O segundo número é maior ou eles são iguais");
		}
		
		System.out.println("\n");
		
		
		// 3 - Aprovação por nota

		double nota;
		System.out.print("Informe a nota 1: ");
		nota = scanner.nextDouble();
		if(nota < 7) {
			System.out.println("Reprovado, sua nota foi " + nota );
		} else {
			System.out.println("Aprovado, sua nota foi " + nota );
		}
		
		System.out.println("\n");
		
		
		// 4 - Verificar número positivo

		int num5;
		System.out.print("Informe um número: ");
		num5 = scanner.nextInt();
		if (num5>0) {
			System.out.println("O número é positivo!!!!!"); 
	    } else {
	    	System.out.println("O número é negativo ou zero");
		}
		
		System.out.println("\n");
		
		// 5 - Cálculo de frete
	
		System.out.print("Informe sua distância em km: ");
		double distancia;
		distancia = scanner.nextDouble();
		if (distancia <= 50) {
		System.out.println("O frete custará R$ 10,00");
		} else {
		double frete = distancia * 0.5;
		System.out.println("O frete custará R$:"+frete);
		}
				
		System.out.println("\n");
		
		// 6 - O número é 10?
		
		System.out.print("Informe um número: ");
		double numeror;
		numeror = scanner.nextDouble();
		if (numeror == 10) {
		System.out.println("O número é 10");
		} else {
		System.out.println("O número não é 10");
		}
			
		System.out.println("\n");
		
		// 7 - Desconto para Associados
				
		System.out.print("Você é associado a nossa loja? ");
		String loja;
		loja = scanner.next();
		if (loja != "sim") {
		System.out.println("Você tem desconto!");
		} else {
		System.out.println("Você não terá desconto.");
		} 
			
		System.out.println("\n");
		
		// 8 - Cálculo de bônus por horas extras
				
	    System.out.print("Quantas horas extras foram trabalhadas? ");
		double horas;
		horas = scanner.nextDouble();
		if (horas < 10) {
		double bonus = horas * 20;
		System.out.println("Bônus por hora extra R$: "+bonus);
		} else {
		double bonus = horas * 15;
		System.out.println("Bônus por hora extra R$: "+bonus);
				
		}
				
			}
			

				
		
		
	}


