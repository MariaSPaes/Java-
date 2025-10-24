public class Musica {
	String titulo;
	String artista;
	int duracao;
	
	void tocar() {
		System.out.println("Tocando "+titulo+" de "+artista);
	}
	void pausar() {
		System.out.println("Música pausada.");
	}
	void mostrarDetalhes() {
		System.out.println("Nome da música: "+titulo+"\n"+"Artista: "+artista+"\n"+"Duração: "+duracao+" minutos.");
	}
	
	
	
}