package curs3;

public class TestParSauImpar {

	public static void main(String[] args) {
		ParSauImpar obj = new ParSauImpar();
		obj.askTheUserForNumber();
		System.out.println(obj.checkOddOrEven(obj.number));
	}

}
