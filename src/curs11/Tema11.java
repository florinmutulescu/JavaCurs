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

		try (OutputStream outputStream = new FileOutputStream("tema11.properties")) {
			Properties propFile = new Properties();
			propFile.setProperty("ardei", "39");
			propFile.setProperty("morcov", "58");
			propFile.setProperty("rosii", "25");
			propFile.setProperty("castraveti", "19");
			propFile.setProperty("ceapa", "51");

			propFile.store(outputStream, "am salvat fisierul");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readPropertiesFile(String key) {

		try (InputStream inputStream = new FileInputStream("tema11.properties")) {

			Properties propFile = new Properties();
			propFile.load(inputStream);

			if (propFile.getProperty(key) == null) {
				System.out.println("Nu vindem aceasta leguma!");
				System.out.println("Va rugam alegeti alta leguma!");
			} else {

				System.out.println("Leguma aleasa de tine are : " + propFile.getProperty(key) + " calorii");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		Tema11 obj = new Tema11();
		obj.writePropertiesFile();
		System.out.println("Va rugam introduceti ce leguma vreti sa cumparati :");
		Scanner scan = new Scanner(System.in);
		String leguma;
		leguma = scan.next();
		System.out.println(leguma);
		obj.readPropertiesFile(leguma);
	}

}
