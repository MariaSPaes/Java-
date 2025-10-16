package primeiroProjeto;

import java.util.Scanner;

public class ProjetoLojadeRoupas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar = "sim";

        // Definindo tamanho máximo para cada categoria
        int MAX = 100;

        // Arrays para armazenar produtos
        String[] calcas = new String[MAX];
        double[] precoCalcas = new double[MAX];
        int[] estoqueCalcas = new int[MAX];
        int qtdCalcas = 0;

        String[] vestidos = new String[MAX];
        double[] precoVestidos = new double[MAX];
        int[] estoqueVestidos = new int[MAX];
        int qtdVestidos = 0;

        String[] blusas = new String[MAX];
        double[] precoBlusas = new double[MAX];
        int[] estoqueBlusas = new int[MAX];
        int qtdBlusas = 0;

        String[] sapatos = new String[MAX];
        double[] precoSapatos = new double[MAX];
        int[] estoqueSapatos = new int[MAX];
        int qtdSapatos = 0;

        // Produtos iniciais (1 produto por categoria)
        calcas[qtdCalcas] = "Calça Jeans"; precoCalcas[qtdCalcas] = 120; estoqueCalcas[qtdCalcas++] = 10;
        vestidos[qtdVestidos] = "Vestido Floral"; precoVestidos[qtdVestidos] = 180; estoqueVestidos[qtdVestidos++] = 5;
        blusas[qtdBlusas] = "Blusa Branca"; precoBlusas[qtdBlusas] = 80; estoqueBlusas[qtdBlusas++] = 12;
        sapatos[qtdSapatos] = "Sapato Social"; precoSapatos[qtdSapatos] = 220; estoqueSapatos[qtdSapatos++] = 7;

        while (continuar.equalsIgnoreCase("sim")) {
            System.out.println("\n===== SISTEMA DE LOJA DE ROUPAS =====");
            System.out.println("1 - Registrar Roupas");
            System.out.println("2 - Registrar Vendas");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) { // Registrar Roupas
                System.out.println("\nCategorias:");
                System.out.println("1 - Calça");
                System.out.println("2 - Vestido");
                System.out.println("3 - Blusa");
                System.out.println("4 - Sapato");
                System.out.print("Escolha uma categoria: ");
                int categoria = sc.nextInt();
                sc.nextLine();

                System.out.print("Nome da roupa: ");
                String nome = sc.nextLine();
                System.out.print("Preço (R$): ");
                double preco = sc.nextDouble();
                System.out.print("Quantidade em estoque: ");
                int qtd = sc.nextInt();
                sc.nextLine();

                switch (categoria) {
                    case 1 -> { calcas[qtdCalcas] = nome; precoCalcas[qtdCalcas] = preco; estoqueCalcas[qtdCalcas++] = qtd; }
                    case 2 -> { vestidos[qtdVestidos] = nome; precoVestidos[qtdVestidos] = preco; estoqueVestidos[qtdVestidos++] = qtd; }
                    case 3 -> { blusas[qtdBlusas] = nome; precoBlusas[qtdBlusas] = preco; estoqueBlusas[qtdBlusas++] = qtd; }
                    case 4 -> { sapatos[qtdSapatos] = nome; precoSapatos[qtdSapatos] = preco; estoqueSapatos[qtdSapatos++] = qtd; }
                    default -> System.out.println("Categoria inválida!");
                }

                System.out.println("Roupa registrada com sucesso!");

            } else if (opcao == 2) { // Registrar Vendas
                System.out.println("\nCategorias:");
                System.out.println("1 - Calça");
                System.out.println("2 - Vestido");
                System.out.println("3 - Blusa");
                System.out.println("4 - Sapato");
                System.out.print("Escolha uma categoria: ");
                int categoria = sc.nextInt();
                sc.nextLine();

                String[] produtos = new String[0];
                double[] precos = new double[0];
                int[] estoques = new int[0];
                int qtdProdutos = 0;

                switch (categoria) {
                    case 1 -> { produtos = calcas; precos = precoCalcas; estoques = estoqueCalcas; qtdProdutos = qtdCalcas; }
                    case 2 -> { produtos = vestidos; precos = precoVestidos; estoques = estoqueVestidos; qtdProdutos = qtdVestidos; }
                    case 3 -> { produtos = blusas; precos = precoBlusas; estoques = estoqueBlusas; qtdProdutos = qtdBlusas; }
                    case 4 -> { produtos = sapatos; precos = precoSapatos; estoques = estoqueSapatos; qtdProdutos = qtdSapatos; }
                    default -> { System.out.println("Categoria inválida!"); continue; }
                }

                System.out.println("\n--- PRODUTOS DISPONÍVEIS ---");
                for (int i = 0; i < qtdProdutos; i++) {
                    System.out.println((i + 1) + " - " + produtos[i] + " | R$" + precos[i] + " | Estoque: " + estoques[i]);
                }

                System.out.print("Escolha o número do produto: ");
                int escolha = sc.nextInt() - 1;

                if (escolha < 0 || escolha >= qtdProdutos) {
                    System.out.println("Produto inválido!");
                    continue;
                }

                if (estoques[escolha] <= 0) {
                    System.out.println("Estoque esgotado!");
                    continue;
                }

                System.out.print("Quantidade vendida: ");
                int qtdVendida = sc.nextInt();
                sc.nextLine();

                if (qtdVendida > estoques[escolha]) {
                    System.out.println("Quantidade indisponível!");
                    continue;
                }

                double total = precos[escolha] * qtdVendida;
                double desconto = 0;
                if (qtdVendida > 3) {
                    desconto = total * 0.10;
                    total -= desconto;
                }

                // Atualizar estoque
                estoques[escolha] -= qtdVendida;

                System.out.println("\n--- RELATÓRIO DE VENDA ---");
                System.out.println("Produto: " + produtos[escolha]);
                System.out.println("Unidades vendidas: " + qtdVendida);
                System.out.println("Desconto aplicado: R$" + desconto);
                System.out.println("Total a pagar: R$" + total);

            } else {
                System.out.println("Opção inválida!");
            }

            System.out.print("\nDeseja usar o sistema novamente? (sim/não): ");
            continuar = sc.nextLine();
        }

        System.out.println("\nSistema encerrado. Obrigado!");
        sc.close();
    }
}
