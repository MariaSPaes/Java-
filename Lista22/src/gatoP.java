import java.util.Scanner;

public class gatoP {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		gato cat = new gato();
		
		System.out.println("1 - Classe Gato"+"\n");
		
		cat.nome = "Miau";
		cat.idade = 13;
		cat.raca = "Persa";

		cat.miar();
		cat.comer();
		cat.mostrarInformacoes();

		System.out.println("\n"+"---------------"+"\n");

		System.out.println("Digite o nome do gato: ");
		cat.nome = sc.next();
		System.out.println("Digite a idade do gato: ");
		cat.idade = sc.nextInt();
		System.out.println("Digite a raça do gato: ");
		cat.raca = sc.next();
		
		cat.miar();
		cat.comer();
		cat.mostrarInformacoes();

	}

}
