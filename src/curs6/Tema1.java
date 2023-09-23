package curs6;

import java.util.Scanner;

/*Scriem un program care simuleaza un login
 * Programul primeste input de la utilizator
 * un user si o parola
 * Are 3 incercari de logare
 * atata timp cat incearca de 3 ori si credentialele
 * sunt gresite programul va printa:
 * "Maxim attempts reached.User blocked"
 * pentru fiecare incercare gresita programul printeaza:
 * "Login Error"
 * Daca credentialele sunt valide programul printeaza:
 * "Login Sucessful"
 * Note:
 * Userul este String si valoarea valida este:"TestUser"
 * Parola este int si valoarea valida este:1234
 * 
 * 
 */

public class Tema1 {

	String username;
	int password;
	Scanner scan = new Scanner(System.in);
	boolean valid = true;
	int counter;

	public String getUsername() {
		System.out.println("Introdu username");
		username = scan.next();
		return username;
	}

	public int getPassword() {
		System.out.println("Introdu parola");
		password = scan.nextInt();
		return password;
	}

	public void verifPassword() {
		if (username.equals("TestUser") && (password == 1234)) {
			System.out.println("Login Sucessful");
		} else {
			System.out.println("Login Errror");
			counter++;
			valid = false;
		}

	}

	public void validatePassword() {

		do {
			getUsername();
			getPassword();
			verifPassword();

		} while (counter < 3 && !valid);
		if (counter == 3)
			System.out.println("Maxim attempts reached.User blocked");
	}

	public static void main(String[] args) {
		Tema1 logare = new Tema1();
		logare.validatePassword();
	}
}
