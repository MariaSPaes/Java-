import java.util.Scanner;

public class FilmeP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Filme fil = new Filme();
		
		fil.titulo = "The Notebook";
		fil.genero = "Drama";
		fil.duracao = 2;
		
		fil.assistir ();
		fil.mostrarInformacoes();
		System.out.println("\n"+"------------"+"\n");
		
		fil.titulo = "Run";
		fil.genero = "Terror";
		fil.duracao = 5;
		
		fil.assistir();
		fil.mostrarInformacoes();
		
		System.out.println("\n"+"------------"+"\n");

		System.out.println("Qual nome do filme? ");
		fil.titulo = scanner.next();
		System.out.println("Qual gênero do filme? ");
		fil.genero = scanner.next();
		System.out.println("Qual duração do filme? ");
		fil.duracao = scanner.nextInt();
		
		fil.assistir();
		fil.mostrarInformacoes();

	}

}