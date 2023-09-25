package curs7;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		String[] textArray = new String[4];
		// String[] textArray ={null,null,null,null}
		// index: 0 1 2 3
		System.out.println(textArray[0]);
		textArray[0] = "this";
		System.out.println(textArray[0]);

		// String[] textArray = {this, null, null, null}
		textArray[1] = "is ";
		// String[] textArray = {this, is, null, null}
		System.out.println(textArray[1]);
		textArray[2] = "an ";
		textArray[3] = "array ";
		// String[] textArray = {this, is, an , array}
		System.out.println(Arrays.toString(textArray));

		System.out.println("----------------");

		for (int i = 0; i < textArray.length; i++) {

			System.out.print(textArray[i]);

		}

		System.out.println("\n-------------------------------");

		// for each
		for (String element : textArray) {
			System.out.println(element);

		}
	}

}
