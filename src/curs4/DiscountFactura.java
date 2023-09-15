package curs4;
/*
 * program care aplica un discount unei facturi
 * daca valoarea facturii este >100 se aplica un discount de 10%
 * daca valoarea facturii este <100 se aplica un discount de 5%
 * printam rezultatul
 */

import java.util.Scanner;

public class DiscountFactura {

	public static void main(String[] args) {
		double valoareFactura;
		double valoareFinalaFactura;
		double discount;

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti valoarea facturii:");
		valoareFactura = scan.nextInt();
		scan.close();
		discount = (valoareFactura > 100) ? valoareFactura / 10 : valoareFactura / 20;
		System.out.println("Discount=" + discount);
		valoareFinalaFactura = valoareFactura - discount;
		System.out.println("Valoarea finala factura =" + valoareFinalaFactura);
	}

}
