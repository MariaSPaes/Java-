import java.util.Scanner;

public class Animal1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		Animal anim = new Animal();
		Cachorro dog = new Cachorro();
		Gato cat = new Gato();
		
		System.out.println("Qual nome do animal? ");
		String nome = scanner.next();
		System.out.println("Qual a idade do animal? ");
		int idade = scanner.nextInt();
		System.out.println("Qual a raça do cachorro? ");
		String raca = scanner.next();
		System.out.println("Qual a cor do gato? ");
		String cor = scanner.next();
		
		anim.setNome(nome);
		anim.setIdade(idade);
		dog.setRaca(raca);
		cat.setCor(cor);
		
		System.out.println("\n");
		
		anim.mostrarInfo();
		System.out.println("A raça é: "+dog.getRaca());
		System.out.println("A cor é: "+cat.getCor());
		
		System.out.println("\n");
		
		dog.abanarRabo();
		cat.subirNoMuro();
	}

}
