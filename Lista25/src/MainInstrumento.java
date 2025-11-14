import java.util.Scanner;

public class MainInstrumento {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha um instrumento:");
		System.out.println("1 - Violão");
		System.out.println("2 - Bateria");
		System.out.println("3 - Piano");
		System.out.print("Opção: ");
		int opc = sc.nextInt();

		Instrumento instrumento;

		if (opc == 1)
			instrumento = new Violao();
		else if (opc == 2)
			instrumento = new Bateria();
		else
			instrumento = new Piano();

		instrumento.tocar();
	}
}
