
public class RetanguloP {
    public static void main(String[] args) {
        Retangulo r = new Retangulo();

        r.setLargura(4);
        r.setAltura(6);

        System.out.println("Área: " + r.calcularArea());
        System.out.println("Perímetro: " + r.calcularPerimetro());
    }
}
