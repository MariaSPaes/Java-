package primeiroProjeto;

import java.util.Scanner;

public class Lista13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		  // 1 - Contador:
      for (int contador = 10; contador <= 30; contador++) {
          System.out.println(contador);
      }
      System.out.println("------------");

      // 2 - Classificação de Idades:
      int idade;
      for (int i = 1; i <= 10; i++) {
          System.out.println("Digite a idade " + i + ":");
          idade = scanner.nextInt();
          if (idade >= 18) {
              System.out.println("Maior de idade");
          } else {
              System.out.println("Menor de idade");
          }
      }
      System.out.println("------------");

      // 3 - Eleição:
      int voto;
      for (int i = 1; i <= 5; i++) {
          System.out.println("Digite o voto " + i + " (1 a 6):");
          voto = scanner.nextInt();
          switch (voto) {
              case 1:
                  System.out.println("Voto para o candidato 1");
                  break;
              case 2:
                  System.out.println("Voto para o candidato 2");
                  break;
              case 3:
                  System.out.println("Voto para o candidato 3");
                  break;
              case 4:
                  System.out.println("Voto para o candidato 4");
                  break;
              case 5:
                  System.out.println("Voto nulo");
                  break;
              case 6:
                  System.out.println("Voto em branco");
                  break;
              default:
                  System.out.println("Código inválido");
          }
      }
      System.out.println("------------");

      // 4 - Repetição de frase:
      System.out.println("Digite uma frase:");
      String frase = scanner.nextLine();
      System.out.println("Digite o número de repetições:");
      int vezes = scanner.nextInt();
      for (int i = 1; i <= vezes; i++) {
          System.out.println(frase);
      }
      System.out.println("------------");

      // 5 - Sequência:
      for (int num = 50; num >= 30; num--) {
          System.out.println(num);
      }
      System.out.println("------------");

      // 6 - Números alternados:
      for (int alt = 1; alt <= 50; alt += 2) {
          System.out.println(alt);
      }
      System.out.println("------------");

      // 7 - Aprovado ou Reprovado:
      double nota;
      for (int i = 1; i <= 5; i++) {
          System.out.println("Digite a nota " + i + ":");
          nota = scanner.nextDouble();
          if (nota >= 6.0) {
              System.out.println("Aprovado");
          } else {
              System.out.println("Reprovado");
          }
      }
      System.out.println("------------");

      // 8 - Categoria de idade:
      int idadePessoa;
      for (int i = 1; i <= 5; i++) {
          System.out.println("Digite a idade da pessoa " + i + ":");
          idadePessoa = scanner.nextInt();
          if (idadePessoa <= 12) {
              System.out.println("Criança");
          } else if (idadePessoa <= 17) {
              System.out.println("Adolescente");
          } else if (idadePessoa <= 59) {
              System.out.println("Adulto");
          } else {
              System.out.println("Idoso");
          }
      }
      System.out.println("------------");

      // 9 - Número Positivo ou Negativo:
      int numero22;
      for (int i = 1; i <= 7; i++) {
          System.out.println("Digite o número " + i + ":");
          numero22 = scanner.nextInt();
          if (numero22 > 0) {
              System.out.println("Positivo");
          } else if (numero22 < 0) {
              System.out.println("Negativo");
          } else {
              System.out.println("Zero");
          }
      }
      System.out.println("------------");

    
  }

	}


