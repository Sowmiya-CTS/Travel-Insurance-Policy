package utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    Properties properties;

    public ConfigReader() {
        try {
        	InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties");
        	Properties properties = new Properties();
        	properties.load(input);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
