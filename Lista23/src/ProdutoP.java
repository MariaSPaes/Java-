
public class ProdutoP {
    public static void main(String[] args) {
        Produto p1 = new Produto();

        p1.setNome("Carrinho");
        p1.setPreco(50.00);
        p1.setEstoque(4);

        System.out.println("Produto: " + p1.getNome());
        System.out.println("Preço: " + p1.getPreco());
        System.out.println("Estoque: " + p1.getEstoque());
    }
}
