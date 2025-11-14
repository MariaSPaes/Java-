import java.util.Scanner;

public class MainPadaria {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual produto deseja preparar?");
        System.out.println("1 - Pão");
        System.out.println("2 - Bolo");
        System.out.println("3 - Torta");
        System.out.print("Escolha: ");
        int opc = sc.nextInt();

        ProdutoPadaria produto;

        if (opc == 1) produto = new Pao();
        else if (opc == 2) produto = new Bolo();
        else produto = new Torta();

        produto.preparar();
    }
}