package primeiroProjeto;

import java.util.Scanner;

public class Lista6 {

	public static void main(String[] args) {

		
		//1 - Intervalo numérico
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Informe um número: ");
		int num = scanner.nextInt();
		
		if (num >= 10 && num <= 20 ) {
			System.out.println("Número dentro do intervalo");
		} else {
			System.out.println("Número fora do intervalo");
		}
		
		System.out.println("\n");
		
		// 2  - Acesso à festa
		System.out.print("Qual sua idade? ");
		int idade = scanner.nextInt();
		System.out.print("Você tem o convite? (true/false): ");
		boolean convite = scanner.nextBoolean();
		
		if (idade >= 18 && convite ) {
			System.out.println("Entrada Permitida");
		} else {
			System.out.println("Entrada Negada");
		}
		
		System.out.println("\n");
		
		// 3 - Categoria de esporte
		
		System.out.print("Informe sua idade: ");
		int idade1 = scanner.nextInt();
		
		if (idade1 < 12 || idade1 > 60)  {
			System.out.println("Categoria Especial");
		} else {
			System.out.println("Categoria Normal");
		}
		
		System.out.println("\n");
		
		// 4 - Desconto no produto
		
		System.out.print("Qual o valor do produto?");
		int precoo = scanner.nextInt();
		System.out.print("Qual a forma de pagamento? (avista ou cartão)");
		String forma = scanner.next();
		if (precoo >= 100 && forma.equalsIgnoreCase("avista")){
			System.out.println("Você tem 10% de desconto!");
		} else {
			System.out.println("O valor é " + precoo + " reais \n");
			
		}
		
		System.out.println("\n");
		
		// 5 - Triagem médica
		
		System.out.print("Informe sua temperatura: ");
		int temp = scanner.nextInt();
		System.out.print("Você tem sintomas? (true/false): ");
		boolean sint = scanner.nextBoolean();
		
		if (temp >= 38 || sint ) {
			System.out.println("Recomenda-se procurar um médico.");
		} else {
			System.out.println("Sem sinais preocupantes.");
		}
		
		System.out.println("\n");
		
		// 6 - Votação
		
		System.out.print("Informe sua idade: ");
		int idd = scanner.nextInt();
		System.out.print("Você é brasileiro?: ");
		boolean brasil = scanner.nextBoolean();
		
		if (idd >= 16 && brasil ) {
			System.out.println("Pode votar");
		} else {
			System.out.println("Não pode votar!");
		}
		
		System.out.println("\n");
		
		// 7 - Bônus de funcionário
		System.out.print("Informe a quantidade de horas extras: ");
		int horas = scanner.nextInt();
		System.out.print("Informe o número de faltas:");
		int faltas = scanner.nextInt();
		
		if (horas > 20 && faltas < 5 ) {
			System.out.println("Você ganhou um bônus!!");
		} else {
			System.out.println("Você não ganhou um bônus!");
		}
	
		System.out.println("\n");
		
		// 8 - Autorização para dirigir
		System.out.print("Informe sua idade: ");
		int idade22 = scanner.nextInt();
		System.out.print("Você possui carteira de motorista? (true/false): ");
		boolean carteira = scanner.nextBoolean();
		
		if (idade22 >= 18 && carteira ) {
			System.out.println("Pode dirigir.");
		} else {
			System.out.println("Não pode dirigir.");
		}
		
		System.out.println("\n");
		
		// 9 - Elegibilidade para Bolsa de Estudos
		System.out.print("Qual a sua nota? (0 a 10)");
		double nota = scanner.nextDouble();
		System.out.println("Qual sua frequência (0 a 100)");
		int frequencia=scanner.nextInt();

		if(nota >= 8 || frequencia >= 80) {
			System.out.println("Bolsa concedida");
		} else {
			System.out.println("Bolsa não concedida");
		}
		
		System.out.println("\n");
		
		// 10 - Verificação de Temperatura Ambiente
		System.out.print("Qual a temperatura em graus? ");
		int temperatura = scanner.nextInt();
		System.out.println("E a umidade? (%)");
		int umi = scanner.nextInt();
		if (temperatura < 18 || temperatura > 26 && umi >= 60) {
			System.out.println("Ajustar climatização");
		}else {
			System.out.println("Climatização não necessária");
		}
	}

}
