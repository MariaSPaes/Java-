
public class Pizza extends Prato {

    public Pizza() {
        super("Pizza");
    }

    @Override
    public double calcularPreco() {
        return 40.0;
    }
}
