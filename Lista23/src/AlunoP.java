
import java.util.Scanner;

public class AlunoP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno a1 = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        a1.setNome(sc.nextLine());

        System.out.print("Digite a idade do aluno: ");
        a1.setIdade(sc.nextInt());

        System.out.println("\nDados do aluno:");
        System.out.println("Nome: " + a1.getNome());
        System.out.println("Idade: " + a1.getIdade());

        sc.close();
    }
}
