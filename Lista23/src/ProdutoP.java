
import java.util.Scanner;

public class ProdutoP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto p1 = new Produto();

        System.out.print("Digite o nome do produto: ");
        p1.setNome(sc.nextLine());

        System.out.print("Digite o preço do produto: ");
        p1.setPreco(sc.nextDouble());

        System.out.print("Digite a quantidade em estoque: ");
        p1.setEstoque(sc.nextInt());

        System.out.println("\nDados do produto:");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Preço: " + p1.getPreco());
        System.out.println("Estoque: " + p1.getEstoque());

        sc.close();
    }
}
