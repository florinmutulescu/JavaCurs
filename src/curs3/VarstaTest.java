package curs3;

import java.util.Scanner;

public class VarstaTest {
	int varsta;

	public int intreabaVarsta() {
		System.out.println("Introduceti varsta! ");
		Scanner scan = new Scanner(System.in);
		varsta = scan.nextInt();
		return varsta;
	}

	public String verificaVarsta() {
		if (varsta < 18) {
			return "Esti minor!";
		} else if (varsta <= 65) {
			return "Esti adult!";
		} else {
			return "Esti batran!";
		}

	}

}
