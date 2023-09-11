package curs3;

public class ComparareaStringurilor {

	public static void main(String[] args) {
		String first = "Java";
		String second = "automation";
		String third = "Java";

		String fourth = new String("Java");

		System.out.println("Case==");
		System.out.println(first == second);
		System.out.println("Compare cu equals");
		System.out.println(first.equals(second));

		System.out.println("--------------");
		System.out.println("Compare cu ==");
		System.out.println(first == third);
		System.out.println("Compare cu equals");
		System.out.println(first.equals(third));
		System.out.println("--------------");

		System.out.println("Case==");
		System.out.println(first == fourth);
		System.out.println("Compare cu equals");
		System.out.println(first.equals(fourth));
		System.out.println("--------------");
	}

}
