import java.util.Scanner;

public class MainRestaurante {

	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Escolha um prato:");
	        System.out.println("1 - Pizza");
	        System.out.println("2 - Lasanha");
	        System.out.println("3 - Salada");
	        System.out.print("Opção: ");
	        int opc = sc.nextInt();

	        Prato prato;

	        if (opc == 1) prato = new Pizza();
	        else if (opc == 2) prato = new Lasanha();
	        else prato = new Salada();

	        System.out.println(prato.nome + " custa R$ " + prato.calcularPreco());
	    }
	}
