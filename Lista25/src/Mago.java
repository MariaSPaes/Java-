
public class Mago extends Personagem {

	public Mago() {
		super("Mago");
	}

	@Override
	public void realizarAcao() {
		System.out.println("O mago lança o ataque supremo.");
	}
}
