
public class Dinheiro extends Pagamento {

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento em dinheiro aprovado.");
    }
}
