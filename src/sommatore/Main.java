package sommatore;

public class Main {


	public static void main(String[] argc) {
		Sommatore s = new Sommatore(40, 20);
		System.out.println(s.somma());
		System.out.println(s.sommaStrana());
		System.out.println(s.somma(3,2));
		System.out.println(s.sommaStrana(3,2));
	}
}

