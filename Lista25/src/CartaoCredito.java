
public class CartaoCredito extends Pagamento {

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via Cartão de Crédito aprovado.");
    }
}
