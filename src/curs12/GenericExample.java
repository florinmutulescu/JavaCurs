package curs12;

public class GenericExample {
	public static void main(String[] args) {
		printDetails("String");
		printDetails(20.23);
		printDetails(false);
		printDetails('x');

		// printArguments(true, 1, "text", 34.22);
		// printArguments("text");
		printArguments(20.20, 12, 4000L);
	}

	public static <T> void printDetails(T obj) {
		System.out.println("Obiect " + obj);
		System.out.println("Data type obiect " + obj.getClass().getName());

	}

	public static <T extends Number> void printArguments(T... values) {

		for (T element : values) {
			System.out.println(element);
		}

	}

}
