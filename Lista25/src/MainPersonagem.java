import java.util.Scanner;

public class MainPersonagem {
	   public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Escolha um personagem:");
	        System.out.println("1 - Guerreiro");
	        System.out.println("2 - Mago");
	        System.out.println("3 - Curandeiro");
	        System.out.print("Opção: ");
	        int opc = sc.nextInt();

	        Personagem p;

	        if (opc == 1) p = new Guerreiro();
	        else if (opc == 2) p = new Mago();
	        else p = new Curandeiro();

	        p.realizarAcao();
	    }
	}