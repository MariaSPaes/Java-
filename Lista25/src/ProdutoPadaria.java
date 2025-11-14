
public class ProdutoPadaria {
    protected String nome;

    public ProdutoPadaria(String nome) {
        this.nome = nome;
    }

    public void preparar() {
        System.out.println("Preparando um produto da padaria.");
    }
}