
import java.util.Scanner;

public class AvaliacaoP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Avaliacao a = new Avaliacao();

        System.out.print("Digite o nome do aluno: ");
        a.setNome(sc.nextLine());

        System.out.print("Digite a primeira nota: ");
        a.setNota1(sc.nextDouble());

        System.out.print("Digite a segunda nota: ");
        a.setNota2(sc.nextDouble());

        System.out.println("\nAluno: " + a.getNome());
        System.out.println("Média final: " + a.calcularMedia());

        sc.close();
    }
}
