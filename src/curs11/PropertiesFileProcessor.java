package curs11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFileProcessor {
	public void writePropertiesFile() {

		try (OutputStream outPutStream = new FileOutputStream("test.properties")) {
			Properties propFile = new Properties();
			propFile.setProperty("user", "TestUser");
			propFile.setProperty("email", "TestUser@test.com");
			propFile.setProperty("browser", "Firefox");
			propFile.setProperty("url", "Test");

			propFile.store(outPutStream, "am salvat fisierul");
			// outPutStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
