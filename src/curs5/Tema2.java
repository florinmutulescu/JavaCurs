package curs5;

/*program care intreaba utilizatorul un numar
 * si printeaza tabla inmultirii acelui numar de la 1 la10
 * Exemplu
 * Please enter a number:
 * 3
 * Printam:
 * 3*1=3
 * 3*2=6
 * 3*3=9
 * ---etc 
 */
import java.util.Scanner;

public class Tema2 {
	int number;
	int produs[] = new int[10];

	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number:");
		number = scan.nextInt();
		scan.close();
	}

	public void tablaInmultiri() {
		System.out.println("Printam :");
		for (int i = 1; i < 11; i++) {
			produs[i - 1] = number * i;
			System.out.println(number + "*" + i + "=" + produs[i - 1]);
		}
	}

	public static void main(String[] args) {
		Tema2 obj = new Tema2();
		obj.askTheUser();
		obj.tablaInmultiri();
	}

}
