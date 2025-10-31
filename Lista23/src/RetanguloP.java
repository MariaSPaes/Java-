
import java.util.Scanner;

public class RetanguloP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo r = new Retangulo();

        System.out.print("Digite a largura do retângulo: ");
        r.setLargura(sc.nextDouble());

        System.out.print("Digite a altura do retângulo: ");
        r.setAltura(sc.nextDouble());

        System.out.println("Área: " + r.calcularArea());
        System.out.println("Perímetro: " + r.calcularPerimetro());

        sc.close();
    }
}
