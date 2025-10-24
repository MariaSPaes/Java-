import java.util.Scanner;

public class VideoGameP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		VideoGame game = new VideoGame();

		System.out.println("Qual a marca do console? ");
		game.marca = scanner.next();
		System.out.println("Qual modelo do console? ");
		game.modelo = scanner.next();
		System.out.println("Ele está ligado ou desligado?");
		game.ligado = scanner.nextBoolean();

		game. verificarStatus();

		}}
	



