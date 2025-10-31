
public class Carro {
    private String modelo;
    private int ano;
    private int velocidadeAtual = 0;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void acelerar(int valor) {
        velocidadeAtual += valor;
    }

    public void frear(int valor) {
        velocidadeAtual -= valor;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
}
