
public class AvaliacaoP {
    public static void main(String[] args) {
        Avaliacao a = new Avaliacao();

        a.setNome("João");
        a.setNota1(9);
        a.setNota2(7);

        System.out.println("Aluno: " + a.getNome());
        System.out.println("Média Final: " + a.calcularMedia());
    }
}
