package curs7;

public class ArrayExample {

	public static void main(String[] args) {
		String[] textArray = new String[4];
		// String[] textArray ={null,null,null,null}
		// index: 0 1 2 3
		System.out.println(textArray[0]);
		textArray[0] = "this";
		System.out.println("n----------------");
		// for each
		for (String element : textArray) {
			System.out.println(element);

		}
	}

}
