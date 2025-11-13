
public class Vendedor extends Funcionario{
    private double comissao = 500;

    public double calcularSalario() {
        return getSalario() + comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public void vender() {
        System.out.println(getNome1() + " realizou uma venda!");
    }
}
