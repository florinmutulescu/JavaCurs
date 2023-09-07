package curs2;

public class Tester {
	String nume;
	int varsta;
	int ratePerHour = 1;

	// constructori
	// constructor default;
	// public Tester(){};

	public Tester(int salariuPeOra) {
		ratePerHour = salariuPeOra;
	}

	public Tester(int salariuPeOra, int varsta, String denumire) {
		ratePerHour = salariuPeOra;
		varsta = varsta;
	}
}
