package curs2;

public class SalaryCaculator {

	public static void main(String[] args) {
		Tester tester1 = new Tester(30);
		tester1.nume = "Maria";
		tester1.varsta = 25;
		System.out.println(tester1.ratePerHour);

		Tester tester2 = new Tester(30);
		tester2.nume = "Ion";
		tester2.varsta = 25;
		// tester2.ratePerHour=45;
		System.out.println(tester2.ratePerHour);
	}
}