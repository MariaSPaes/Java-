
public class CarroP {
    public static void main(String[] args) {
        Carro c = new Carro();

        c.setModelo("Uno");
        c.setAno(2015);

        c.acelerar(30);
        System.out.println("Velocidade: " + c.getVelocidadeAtual());

        c.frear(20);
        System.out.println("Velocidade: " + c.getVelocidadeAtual());
    }
}
