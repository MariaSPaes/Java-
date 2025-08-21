package primeiroProjeto;

import java.util.Scanner;

public class Lista05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		// 1 - Classificação de idade
        int idade;
        System.out.println("Informe sua idade: ");
        idade = scanner.nextInt();
        if (idade < 12) {
        	System.out.println("Criança");
        } else if (idade < 17) {
        	System.out.println("Adolescente");
        } else if (idade < 59) {
        	System.out.println("Adulto");
        } else if (idade > 60) {
            System.out.println("Idoso");
        } 
		
        System.out.println("\n");
        
		// 2 - Avaliação de Temperatura
        
        int temp1;
        System.out.println("Informe a temperatura em graus celsius: ");
        temp1 = scanner.nextInt();
        if (temp1 < 10) {
        	System.out.println("Muito frio");
        } else if (temp1 < 20) {
        	System.out.println("Frio");
        } else if (temp1 < 30) {
        	System.out.println("Agradável");
        } else if (temp1 > 30) {
            System.out.println("Muito quente");
        }
		
        System.out.println("\n");
        
		// 3 - Sistema de Notas Escolares
        
        int nota1;
        System.out.println("Informe sua nota: ");
        nota1 = scanner.nextInt();
        if (nota1 < 60) {
        	System.out.println("Nota F");
        } else if (nota1 < 70) {
        	System.out.println("Nota D");
        } else if ( nota1 < 80) {
        	System.out.println("Nota C");
        } else if (nota1 > 90) {
            System.out.println("Nota B");
        } else {
        	System.out.println("Nota A");
        }
        
        System.out.println("\n");
		
		
		// 4 - Verificação de senha
        String senha = "admin";
        System.out.println("Informe a senha:");
        senha = scanner.next();
	    if (senha.equals("admin")) {		
	    	System.out.println("Acesso Permitido!");
	    } else {
	    	System.out.println("Acesso Negado!!!");
	    }
		
	    System.out.println("\n");
		
		// 5 - Comparação de nomes

		String nome1, nome2;
		System.out.println("Informe o primeiro nome: ");
		nome1 = scanner.next();
		System.out.println("Informe o segundo nome: ");
		nome2 = scanner.next();
		if (nome1.equals(nome2)) {
			System.out.println("Os nomes são iguais");
		} else {
			System.out.println("Os nomes são diferentes");
		}
		
		System.out.println("\n");
		
		// 6 - Jogo da cor favorita
		System.out.println("Informe sua cor favorita: ");
		String cor = scanner.next();
		if(cor.equalsIgnoreCase("azul")) {
			System.out.println("Boa escolha!");
		} else if (cor.equalsIgnoreCase("vermelho")) {
			System.out.println("A cor vibrante");
		} else if (cor.equalsIgnoreCase("verde")) {
			System.out.println("A cor da natureza");
		} else {
			System.out.println("Cor não cadastrada");
		}
		
		// 7 - Verificação de vogal
		
		System.out.println("Digite uma letra: ");
		String vogal = scanner.next();
		if(vogal.equalsIgnoreCase("A")) {
			System.out.println("é uma vogal");
		} else if (vogal.equalsIgnoreCase("E")) {
			System.out.println("É uma vogal");
		} else if (vogal.equalsIgnoreCase("I")) {
			System.out.println("É uma vogal");
		} else if (vogal.equalsIgnoreCase("O")) {
			System.out.println("É uma vogal");
		} else if (vogal.equalsIgnoreCase("U")) {
			System.out.println("É uma vogal");
		} else {
			System.out.println("Não é vogal");
		}
		
		
	}

}