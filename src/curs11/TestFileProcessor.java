package curs11;

public class TestFileProcessor {

	public static void main(String[] args) {
		TextFileProcessor txtfileObj = new TextFileProcessor();
		txtfileObj.writeFile("Masina");
		txtfileObj.readTxtFile();
	}

}
