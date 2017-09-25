package operation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadObject {
	//public static Properties LOG;
	public static Properties OR;

	public static Properties getProperties() throws IOException {
		
		OR = new Properties();
	FileInputStream	fs = new FileInputStream(new File(System.getProperty("user.dir")
			+ "\\src\\test\\java\\config\\or.properties"));
		OR.load(fs);
		return OR;
	}
}
