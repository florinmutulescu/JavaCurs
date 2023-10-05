package curs10;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] days = { "L", "M", "M", "J", "V", "S", "D" };
		// 0 1 2 3 4 4 6
		System.out.println(days.length);
		try {
			System.out.println(days[9]);
		} catch (ArrayIndexOutOfBoundsException error) {
			System.out.println("Exception occured");

		}

		System.out.println("Alta linie de cod");

	}

}
