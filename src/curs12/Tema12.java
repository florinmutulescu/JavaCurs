package curs12;
/*Scriem un program care reprezinta un catalog.
 Contine Numele si Notele unor elevi (un nume, o nota de fiecare )
 Intrebam elevul cum il cheama si ce nota a luat.
 Daca elevul nu se regaseste in catalogul existent il adaugam cu tot cu nota
 si printam “Nu aveai nota, ti-am trecut acum!”
 Daca elevul se regaseste si nota este mai mica decat nota existenta in
 catalog, printam “Nu ai nevoie de alta nota”
 Daca elevul se regasete si noua nota este mai mare decat nota din catalog,
 facem update catalogului cu noua nota.
 La final indiferent de situatie printam catalogul
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tema12 {

	public static void main(String[] args) {
		String nume;
		Integer nota;
		Scanner scan = new Scanner(System.in);

		Map<String, Integer> catalog = new HashMap<>();

		catalog.put("Ionescu", 9);
		catalog.put("Popescu", 10);
		catalog.put("Marculescu", 8);
		catalog.put("Parvu", 8);
		catalog.put("Ilie", 10);
		catalog.put("Calin", 9);
		System.out.println("Va rog introduceti numele :");
		nume = scan.next();
		System.out.println("Va rog introduceti nota :");
		nota = scan.nextInt();
		if (!catalog.containsKey(nume)) {
			catalog.put(nume, nota);
			System.out.println("Nu aveai nota ,ti-am trecut acum !");
		} else {
			if (nota < catalog.get(nume)) {

				System.out.println("Nu aveai nevoie de alta nota !");
			} else {
				catalog.put(nume, nota);
			}
		}

		System.out.println(catalog);

	}

}
