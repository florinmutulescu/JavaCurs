package curs11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Scanner;

public class Tema11 {

	public void writePropertiesFile() {
		try {
			OutputStream outputStream = new FileOutputStream("tema11.properties");
			Properties propFile = new Properties();
			propFile.setProperty("morcov", "58");
			propFile.setProperty("ceapa ", "20");
			propFile.setProperty("ridichi", "26");
			propFile.setProperty("castraveti", "19");
			propFile.setProperty("rosii", "25");

			propFile.store(outputStream, "am salvat fisierul");
			outputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readPropertiesFile(String key) {

		try (InputStream inputStream = new FileInputStream("tema11.properties")) {

			Properties propFile = new Properties();
			propFile.load(inputStream);

			if (propFile.getProperty(key) == null) {
				System.out.println("Nu vindem aceasta leguma");
				System.out.println("Va rugam introduceti alta leguma");

			} else {
				System.out.println("Leguma aleasa de tine are :" + propFile.getProperty(key) + " calorii");
			}

		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String leguma;
		Tema11 obj = new Tema11();
		obj.writePropertiesFile();

		System.out.println("Va rugam sa introduceti ce leguma vreti sa cumparati:");
		leguma = scan.next();

		obj.readPropertiesFile(leguma);

	}

}
