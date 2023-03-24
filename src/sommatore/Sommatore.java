package sommatore;

public class Sommatore {
	private int a;
	private int b;

	public Sommatore(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int somma() {
		return a + b;
	}

	public int sommaStrana() {
		int a = 0;
		int b = 0;
		return a + b;
	}

	public int somma(int a, int b) {
		return a + b; //5
	}

	public int sommaStrana(int a, int b) {
		return this.a + b; //42
	}
}
