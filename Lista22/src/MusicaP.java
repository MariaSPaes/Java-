import java.util.Scanner;

public class MusicaP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Musica music = new Musica();
		
		music.titulo = "Decide aí";
		music.artista = "Prior";
		music.duracao = 4;
		
		music.tocar();
		music.pausar();
		music.mostrarDetalhes();
		
		System.out.println("\n"+"------------"+"\n");
		
		music.titulo = "Ela vai voltar";
		music.artista = "Charlie Brown J";
		music.duracao = 5;
		
		music.tocar();
		music.pausar();
		music.mostrarDetalhes();
		
		System.out.println("\n"+"------------"+"\n");
		
		System.out.println("Titulo da musica: ");
		music.titulo = scanner.next();
		System.out.println("Nome da artista: ");
		music.artista = scanner.next();
		System.out.println("Duração da música: ");
		music.duracao = scanner.nextInt();
		music.tocar();
		music.pausar();
		music.mostrarDetalhes();
		
		

	}

}