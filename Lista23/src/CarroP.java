
import java.util.Scanner;

public class CarroP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro c = new Carro();

        System.out.print("Digite o modelo do carro: ");
        c.setModelo(sc.nextLine());

        System.out.print("Digite o ano do carro: ");
        c.setAno(sc.nextInt());

        System.out.print("Digite quanto deseja acelerar: ");
        c.acelerar(sc.nextInt());
        System.out.println("Velocidade atual: " + c.getVelocidadeAtual());

        System.out.print("Digite quanto deseja frear: ");
        c.frear(sc.nextInt());
        System.out.println("Velocidade atual: " + c.getVelocidadeAtual());

        sc.close();
    }
}
