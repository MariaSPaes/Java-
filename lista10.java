package primeiroProjeto;

import java.util.Scanner;

public class lista10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 1 - Contador:
		int contador = 10;
		while (contador <= 30) {
			System.out.println(contador);
			contador++; // -1

		}

		// 2 - Soma de Números Digitados:

		System.out.println("------------");

		int contador2 = 1;
		int soma = 0;

		while (contador2 <= 3) {
			System.out.println("Digite o número " + contador2 + ": ");
			int numero = scanner.nextInt();
			soma = soma + numero;
			contador2++;

		}
		System.out.println("A soma é: " + soma);

		System.out.println("---------------");
		
		// 3 - Multiplicação de Números Digitados:

		int contador3 = 1;
        int produto = 1; 
        while (contador3 <= 5) {
            System.out.println("Digite o número " + contador3 + ": ");
            int numero = scanner.nextInt();
            produto = produto * numero;
            contador3++;
        }
        System.out.println("O resultado da multiplicação é: " + produto);

        System.out.println("---------------");

		// 4 - Contar até o número informado
		System.out.println("Digite um número inteiro: ");
		int limite = scanner.nextInt();
		int c = 1;
		while (c <= limite) {
			System.out.println(c);
			c++; // +1
		}

		System.out.println("---------------");

		// 5 - Somar os números de 1 a 5
		int contador5 = 1;
		int soma5 = 0;

		while (contador5 <= 5) {
		    soma5 = soma5 + contador5; // 
		    contador5++;
		}

		System.out.println("A soma dos números de 1 a 5 é: " + soma5);

		// 6 - Tabuada de um número informado
		System.out.println("---------------");
		System.out.println("Digite um número para ver a tabuada: ");
		int tabuada = scanner.nextInt();
		int i = 1;
		while (i <= 10) {
			System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
			i++;
		}

	}

}
