import java.util.Scanner;

public class Veiculo1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Veiculo veic = new Veiculo();
		Carro car = new Carro();
		
		System.out.println("Qual a marca do carro? ");
		String marca = scanner.next();
		System.out.println("Qual o ano de lançamento? ");
		int ano = scanner.nextInt();
		
		veic.setAno(ano);
		veic.setMarca(marca);
		
		veic.exibirInfo();
		car.abrirPortaMalas();
		
		

	}

}
