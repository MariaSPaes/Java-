package primeiroProjeto;

import java.util.Scanner;

public class Lista07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 1 - Classificação de Filme

		System.out.print("Qual sua idade?");
		int idd = scanner.nextInt();

		if (idd < 16 || idd > 70) {
			System.out.println("Classificação Especial!");
		} else {
			System.out.println("Classificação Regular!");
		}

		System.out.println("\n");
		
		// 2 - Promoção de Produto
        
		System.out.print("Qual o valor do produto??");
		double preco = scanner.nextDouble();
		System.out.print("Quantos produtos foram comprados??");
		int qtd = scanner.nextInt();

		double total = preco * qtd;
		if (total > 200 && qtd > 5) {
		    double desconto = total * 0.15;
		    double valorfinal = total - desconto;
		    System.out.printf("Valor com desconto: %.2f\n", valorfinal);
		} else {
		    System.out.printf("Valor total: %.2f\n", total);
		}
		
		System.out.println("\n");
		
		// 3 - Alerta de Saúde
       
		System.out.print("Qual a frequência cardíaca em bpm?");
		int bpm = scanner.nextInt();
		System.out.print("Sente tontura?");
		String tontura = scanner.next();

		if (bpm >= 100 || tontura.equalsIgnoreCase("sim")) {
		    System.out.println("Procure atendimento médico");
		} else {
		    System.out.println("Sem sinais de alerta");
		}
		
		System.out.println("\n");
		
		// 4 - Participação em Concurso

		System.out.print("Qual sua idade?");
		int idadee = scanner.nextInt();
		System.out.print("É residente do estado?");
		String resi = scanner.next();

		if (idadee >= 18 && idadee <= 30 && resi.equalsIgnoreCase("sim")) {
		    System.out.println("Elegível para o concurso");
		} else {
		    System.out.println("Não elegível para o concurso");
		}

		System.out.println("\n");
		
		// 5 - Recompensa por Desempenho

		System.out.print("Quantos projetos foram concluídos?");
		int projetos = scanner.nextInt();
		System.out.print("Quantos erros foram reportados?");
		int erros = scanner.nextInt();

		if (projetos > 10 && erros < 3) {
		    System.out.println("Recompensa concedida");
		} else {
		    System.out.println("Sem recompensa");
		}
		
		System.out.println("\n");
		
		// 6 - Autorização para Viagem

		System.out.print("Qual sua idade?");
		int idade2 = scanner.nextInt();
		System.out.print("Possui passaporte válido?");
		String passaporte = scanner.next();

		if (idade2 >= 18 && passaporte.equalsIgnoreCase("sim")) {
		    System.out.println("Viagem autorizada");
		} else {
		    System.out.println("Viagem não autorizada");
		}
		
		System.out.println("\n");
		
		// 7 - Aprovação em Curso Online

		System.out.print("Qual sua nota final (0 a 100)?");
		int nota = scanner.nextInt();
		System.out.print("Quantas aulas assistidas (0 a 50)?");
		int aulas = scanner.nextInt();

		if (nota >= 70 && aulas >= 40) {
		    System.out.println("Aprovado");
		} else {
		    System.out.println("Reprovado");
		}
		
		System.out.println("\n");
		
		// 8 - Controle de Irrigação
		System.out.print("Qual a umidade do solo em % ?");
		int umi = scanner.nextInt();
		System.out.print("Qual a temperatura em graus celsius?");
		int temp = scanner.nextInt();

		if (umi < 30 || temp > 30) {
		    System.out.println("Irrigação necessária");
		} else {
		    System.out.println("Irrigação não necessária");
		}

		System.out.println("\n");
		
		// 9 - Inscrição em Feira Profissional
		System.out.print("Qual sua idade?");
		int idade3 = scanner.nextInt();
		System.out.print("Possui experiência prévia?");
		String exp = scanner.next();

		if (idade3 >= 20 && idade3 <= 40 && exp.equalsIgnoreCase("sim")) {
		    System.out.println("Inscrição aceita");
		} else {
		    System.out.println("Inscrição não permitida");
		}
	}

}
