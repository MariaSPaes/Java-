package primeiroProjeto;

import java.util.Scanner;

public class Lista08 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		
		// 1 - Classificação de Dia da Semana
		
		System.out.println("Informe um número de 1 a 7 e veja a classificação do dia ");
		int numero = scanner.nextInt();
		switch(numero) {
		case 1:
			System.out.println("Fim de semana");
			break;
		
		case 2:
			System.out.println("Dia útil");
			break;
			
		case 3:
			System.out.println("Dia útil");
			break;
			
		case 4:
			System.out.println("Dia útil");
			break;
			
		case 5:
			System.out.println("Dia útil");
			break;
			
		case 6:
			System.out.println("Dia útil");
			break;
			
		case 7:
			System.out.println("Fim de semana");
			break;
			
		default:
			System.out.println("Dia inválido");
		
		}
		
		System.out.println("\n");
		
		// 2 - Menu de Bebidas

				System.out.println("Insira o código da bebida:");
				System.out.println("1 - Café");
				System.out.println("2 - Chá");
				System.out.println("3 - Suco");
				System.out.println("4 - Refrigerante");
				int escolha = scanner.nextInt();
				switch(escolha) {
				case 1:
					System.out.println("Pague R$5.00");
					break;
				case 2:
					System.out.println("Pague R$3.50");
					break;
				case 3:
					System.out.println("Pague R$4.00");
					break;
				case 4:
					System.out.println("Pague R$4.50");
					break;
				default:
					System.out.println("Código inválido!");
						}
				
				System.out.println("\n");
				
				// 3 - Tipo de Veículo
				
				System.out.println("Insira o código do veículo:");
				System.out.println("1 - Carro");
				System.out.println("2 - Moto");
				System.out.println("3 - Caminhão");
				int veiculo = scanner.nextInt();
				switch(veiculo) {
				case 1:
					System.out.println("Leve");
					break;
				case 2:
					System.out.println("Motocicleta");
					break;
				case 3:
					System.out.println("Pesado");
					break;
				default:
					System.out.println("Veículo inválido");
				}
				
				System.out.println("\n");
				
				// 4 - Escolha de Plano de Assinatura
				
				System.out.println("Insira o código de plano de Assinatura:");
				System.out.println("1 - Básico");
				System.out.println("2 - Intermediário");
				System.out.println("3 - Premium");
				int plano = scanner.nextInt();
				switch(plano) {
				case 1:
					System.out.println("Acesso Limitado");
					break;
				case 2:
					System.out.println("Acesso padrão + suporte");
					break;
				case 3:
					System.out.println("Acesso total + suporte prioritário");
					break;
				default:
					System.out.println("Plano inválido");
				}
				
				System.out.println("\n");
				
				// 5 - Seleção de Mês
				System.out.println("Informe um número de 1 a 12 representando um mês ");
				int num = scanner.nextInt();
				switch(num) {
				case 1, 2, 12:
					System.out.println("Verão");
					break;
				
				case 3, 4, 5:
					System.out.println("Outono");
					break;
					
				case 6, 7, 8:
					System.out.println("Inverno");
					break;
					
				case 9, 10, 11:
					System.out.println("Primavera");
					break;
					
					
				default:
					System.out.println("Mês inválido");
				
				}
				
				System.out.println("\n");
				
				// 6 - Tipo de Ingresso

				System.out.println("Insira o código do ingresso:");
				System.out.println("1 - Inteira");
				System.out.println("2 - Meia-entrada");
				System.out.println("3 - VIP");
				int ingresso = scanner.nextInt();
				switch(ingresso) {
				case 1:
					System.out.println("Pague R$50.00");
					break;
				case 2:
					System.out.println("Pague R$25.00");
					break;
				case 3:
					System.out.println("Pague R$100.00");
					break;
				default:
					System.out.println("Ingresso inválido!");
						}
				
				System.out.println("\n");
				
				// 7 - Escolha de Idioma

				System.out.println("Insira o código do idioma:");
				System.out.println("1 - Português");
				System.out.println("2 - Inglês");
				System.out.println("3 - Espanhol");
				int idioma = scanner.nextInt();
				switch(idioma) {
				case 1:
					System.out.println("Olá");
					break;
				case 2:
					System.out.println("Hello");
					break;
				case 3:
					System.out.println("Hola");
					break;
				default:
					System.out.println("Idioma Inválido!");
						}
				
				System.out.println("\n");
				
				// 8 - Nível de Acesso
				System.out.println("Insira o código de nível:");
				System.out.println("1 - Usuário");
				System.out.println("2 - Moderador");
				System.out.println("3 - Administrador");
				int nivel = scanner.nextInt();
				switch(nivel) {
				case 1:
					System.out.println("Acesso básico");
					break;
				case 2:
					System.out.println("Acesso básico + edição");
					break;
				case 3:
					System.out.println("Acesso total");
					break;
				default:
					System.out.println("Nível Inválido!");
						}
				
				System.out.println("\n");
				
				// 9 - Tipo de Pagamento

				System.out.println("Insira o código de nível:");
				System.out.println("1 - Dinheiro");
				System.out.println("2 - Cartão de Crédito");
				System.out.println("3 - Pix");
				int pagamento = scanner.nextInt();
				switch(pagamento) {
				case 1:
					System.out.println("Pagamento em dinheiro confirmado");
					break;
				case 2:
					System.out.println("Pagamento com cartão processado");
					break;
				case 3:
					System.out.println("Pagamento de pix realizado");
					break;
				default:
					System.out.println("Metodo Inválido!");
						}
	}

}
