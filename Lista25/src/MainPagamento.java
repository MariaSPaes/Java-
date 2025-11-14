import java.util.Scanner;

public class MainPagamento {

	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Escolha a forma de pagamento:");
	        System.out.println("1 - PIX");
	        System.out.println("2 - Cartão de Crédito");
	        System.out.println("3 - Dinheiro");
	        System.out.print("Opção: ");
	        int opc = sc.nextInt();

	        Pagamento pagamento;

	        if (opc == 1) pagamento = new Pix();
	        else if (opc == 2) pagamento = new CartaoCredito();
	        else pagamento = new Dinheiro();

	        pagamento.processarPagamento();
	    }
	}
