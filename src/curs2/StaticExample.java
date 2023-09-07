package curs2;

public class StaticExample {
	String nume;
	static String prenume;

	// declararea unei variabile String varsta;
	// initializare variabila varsta= 24;
	public static void main(String[] args) {
		StaticExample obj1 = new StaticExample();
		obj1.nume = "Maria";
		obj1.prenume = "Ioana";

		StaticExample obj2 = new StaticExample();
		obj2.nume = "Alina";
		obj2.prenume = "Carmen";

		System.out.println(obj1.nume);
		System.out.println(obj1.prenume);
	}

}
