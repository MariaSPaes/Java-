import java.util.Scanner;

public class ProdutoP {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Produto prod = new Produto();

		prod.nome = "Caixa";
		prod.preco = 233;
		prod.estoque = 90;

		prod.vender(40);
		prod.mostrarInformacoes();
		
		System.out.println("\n"+"--------------------"+"\n");
		
		System.out.println("Informe o nome: ");
		prod.nome = scanner.next();
		System.out.println("Informe o preço: ");
		prod.preco = scanner.nextInt();
		System.out.println("Informe o estoque: ");
		prod.estoque = scanner.nextInt();
		System.out.println("Informe a quantidade: ");
		int quantidade = scanner.nextInt();
		
		prod.vender(quantidade);
		prod.mostrarInformacoes();
		
	}
}
