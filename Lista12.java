package primeiroProjeto;
import java.util.Scanner;

public class Lista12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 - Contador: 
        int contador = 10;
        do {
            System.out.println(contador);
            contador++;
        } while (contador <= 30);
        System.out.println("------------");

        // 2 - Adivinhação de número:
        int numero;
        do {
            System.out.println("Digite um número:");
            numero = scanner.nextInt();
        } while (numero != 5);
        System.out.println("Parabéns, você acertou!");
        System.out.println("------------");

        // 3 - Verificação de peso na mala:
        int peso;
        do {
            System.out.println("Digite o peso da mala (kg):");
            peso = scanner.nextInt();
            if (peso > 23) {
                System.out.println("Peso excedido, digite novamente.");
            }
        } while (peso > 23);
        System.out.println("Peso dentro do limite.");
        System.out.println("------------");

        // 4 - Quantidade de páginas lidas na semana:
        int dia = 1;
        int totalPaginas = 0;
        do {
            System.out.println("Quantas páginas você leu hoje?");
            int paginas = scanner.nextInt();
            totalPaginas += paginas;
            dia++;
        } while (dia <= 7);
        System.out.println("Você leu " + totalPaginas + " páginas na semana.");
        System.out.println("------------");

        // 5 - Testar código de acesso:
        int codigo;
        do {
            System.out.println("Digite o código de acesso:");
            codigo = scanner.nextInt();
            if (codigo != 789) {
                System.out.println("Código incorreto, tente novamente.");
            }
        } while (codigo != 789);
        System.out.println("Código correto! Acesso liberado.");
        System.out.println("------------");

        // 6 - Verificar nível de combustível:
        int combustivel;
        do {
            System.out.println("Digite o nível de combustível (litros):");
            combustivel = scanner.nextInt();
            if (combustivel <= 10) {
                System.out.println("Combustível baixo, abasteça!");
            }
        } while (combustivel <= 10);
        System.out.println("Combustível suficiente.");
        System.out.println("------------");

        // 7 - Contar quilômetros percorrido:
        int distancia;
        int totalKm = 0;
        do {
            System.out.println("Digite a distância percorrida (0 ou negativo para encerrar):");
            distancia = scanner.nextInt();
            if (distancia > 0) {
                totalKm += distancia;
            }
        } while (distancia > 0);
        System.out.println("Total de quilômetros percorridos: " + totalKm);

    
    }
}