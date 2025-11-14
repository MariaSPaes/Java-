
public class Torta extends ProdutoPadaria {

    public Torta() {
        super("Torta");
    }

    @Override
    public void preparar() {
        System.out.println("Montando a torta.");
    }
}
