
public class Produto {
	String nome;
	int preco;
	int estoque;
	
	void vender(int quantidade) {
		if(estoque >= 20) {
			double diminui = quantidade - 10;
		} else {
			System.out.println("Estoque insuficiente!");
		}
	}
	
	void mostrarInformacoes() {
		System.out.println("Nome do produto: "+nome+"\n");
		System.out.println("Preço do produto: "+preco+"\n");
		System.out.println("Estoque do produto: "+estoque+"\n");
				
	}
}
