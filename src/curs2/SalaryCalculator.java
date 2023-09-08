package curs2;

public class SalaryCalculator {

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

		Tester tester3 = new Tester(25, 40, "Oana");
		System.out.println(tester3.ratePerHour);
		System.out.println(tester3.nume);
		System.out.println(tester3.varsta);

		SalaryCalculator salCalc = new SalaryCalculator();
		salCalc.caculateSalary(tester3.ratePerHour);

		Tester tester4 = new Tester("Ana", "Junior");
		System.out.println(tester4.nume + " este de senioritate " + tester4.senioritate + "!");

	}

	public int caculateSalary(int ratePerHour) {
		return ratePerHour * 40;
	}

}
