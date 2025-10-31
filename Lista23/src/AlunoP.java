
public class AlunoP {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Maria");
        aluno.setIdade(19); 

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
    }
}
