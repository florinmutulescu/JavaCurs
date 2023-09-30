package curs7;

public class Tema2Optimizata {

	public int numarVocale(String text) {
		int count = 0;
		char litera;
		for (int i = 0; i < text.length(); i++) {
			litera = text.toUpperCase().charAt(i);
			switch (litera) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				count++;
				break;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String text = "Eu invat Java";
		Tema2Optimizata obj = new Tema2Optimizata();
		System.out.println("Vocale: nr.de vocale din text  " + obj.numarVocale(text));
	}

}
