
public class pizza {
	String sabor;
	String tamanho;
	boolean bordaRecheada;

	void preparar() {
	System.out.println("Preparando pizza de "+sabor);
	}
	void assando() {
	System.out.println("Assando pizza tamanho "+tamanho);
	}
	void mostrarInformacoes () {
	if(bordaRecheada) {
	System.out.println("Pizza sabor: "+sabor+"\n"+"Pizza assando: "+tamanho+"\n"+"Borda recheada: "+bordaRecheada);
	} else {
	System.out.println("Pizza sabor: "+sabor+"\n"+"Pizza assando: "+tamanho+"\n"+"Borda recheada: Não tem borda.");

	}
	}}