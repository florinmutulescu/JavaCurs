package curs12;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		String[] names = { "Ion", "Oana", "Ion", "Dana", "Bob" };
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					// System.out.println("Nume duplicate " + names[i]);
					// set.add(names[i]);
				}
			}
		}
		// for(String name:set) {
		// System.out.println("Nume duplicat :");
		// }

	}

}
