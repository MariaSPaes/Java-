import java.util.Scanner;

public class gato {
	String nome;
	String raca;
	int idade;
	
	void miar() {
		System.out.println("Miau!");
	}
	void comer() {
		System.out.println(nome + ", está comendo.");
	}
	void mostrarInformacoes() {
		System.out.println("O nome é: "+nome+"."+"\n"+" A raça é: "+raca+"."+"\n"+" A idade é: "+idade+"."+"\n");
	}

}
