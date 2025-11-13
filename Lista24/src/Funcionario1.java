import java.util.Scanner;

public class Funcionario1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Gerente g = new Gerente();
		Vendedor v = new Vendedor();

		System.out.println("Digite o nome do gerente: ");
		String nomeG = scanner.nextLine();
		g.setNome1(nomeG);

		System.out.println("Digite o salário base do gerente: ");
		double salarioG = scanner.nextDouble();
		g.setSalario(salarioG);

		System.out.println("Digite o departamento do gerente: ");
		String dep = scanner.next();
		g.setDepartamento(dep);

		System.out.println("\nDigite o nome do vendedor: ");
		String nomeV = scanner.next();
		v.setNome1(nomeV);

		System.out.println("Digite o salário base do vendedor: ");
		double salarioV = scanner.nextDouble();

		v.setSalario(salarioV);

		System.out.println("Digite a comissão do vendedor: ");
		double comissao = scanner.nextDouble();

		v.setComissao(comissao);

		System.out.println("\n--- GERENTE ---");
		System.out.println("Nome: " + g.getNome1());
		System.out.println("Salário base: " + g.getSalario());
		System.out.println("Departamento: " + g.getDepartamento());
		System.out.println("Salário final: " + g.calcularSalario());
		g.gerenciar();

		System.out.println("\n--- VENDEDOR ---");
		System.out.println("Nome: " + v.getNome1());
		System.out.println("Salário base: " + v.getSalario());
		System.out.println("Comissão: " + v.getComissao());
		System.out.println("Salário final: " + v.calcularSalario());
		v.vender();
	}

}
