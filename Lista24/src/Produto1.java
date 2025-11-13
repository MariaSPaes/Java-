import java.util.Scanner;

public class Produto1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Livro livro = new Livro();
		Filme filme = new Filme();

		System.out.println("Digite o nome do livro: ");
		String nomeLivro = scanner.nextLine();
		livro.setNome(nomeLivro);

		System.out.println("Digite o autor do livro: ");
		String autorLivro = scanner.nextLine();
		livro.setAutor(autorLivro);

		System.out.println("Digite o nome do filme: ");
		String nomeFilme = scanner.nextLine();
		filme.setNome(nomeFilme);

		System.out.println("Quem é o diretor do filme?");
		String diretorFilme = scanner.nextLine();
		filme.setDiretor(diretorFilme);

		System.out.println("Digite o preço do livro: ");
		double precoLivro = scanner.nextDouble();
		livro.setPreco(precoLivro);

		System.out.println("Qual o preço do filme?");
		double precoFilme = scanner.nextDouble();
		filme.setPreco(precoFilme);

		System.out.println("\n\n");
		System.out.println("--- Informações ---");

		livro.mostrarInfo();
		livro.lerTrecho();

		System.out.println();
		filme.mostrarInfo();
		filme.assistir();
	}

}
