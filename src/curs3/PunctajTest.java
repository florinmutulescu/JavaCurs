package curs3;

import java.util.Scanner;

public class PunctajTest {
	public int intreabaPunctaj() {
		System.out.println("Introduceti punctajul ");
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();

	}

	public String verificaPunctaj() {
		if (intreabaPunctaj() <= 65) {
			return "Ai picat.Mai incearca!";
		} else {
			return "Felicitari,Ai trecut!";

		}
	}

}
