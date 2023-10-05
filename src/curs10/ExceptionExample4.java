package curs10;

public class ExceptionExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// String nume = "Bob";
			String nume = null;
			System.out.println(nume.length());
		} catch (Exception e) {
			System.out.println("Error occured");
			System.out.println(3 / 0);

		} finally {
			System.out.println("Finaly block of cod");

		}
		System.out.println("Code after try-catch");
	}

}
