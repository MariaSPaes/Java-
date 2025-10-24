import java.util.Scanner;

public class pizzaP {

public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);
pizza piz = new pizza();

piz.sabor = "Frango com Catupiry";
piz.tamanho = "Grande";
piz.bordaRecheada = true;
piz.mostrarInformacoes();

System.out.println("\n"+"---------------"+"\n");

System.out.println("Qual sabor da pizza? ");
piz.sabor = scanner.next();
System.out.println("Qual tamanho da pizza? ");
piz.tamanho = scanner.next();
System.out.println("Borda com recheio? ");
piz.bordaRecheada = scanner.nextBoolean();
System.out.println("----------");
piz.mostrarInformacoes();
}}


