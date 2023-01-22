package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {

    private Properties properties;
    private final String propertyPath = "src/test/resources/config.properties";

    public ConfigProperties() throws IOException {
        properties = new Properties();
        FileInputStream fis = new FileInputStream(propertyPath);
        properties.load(fis);
    }

    public String getURL(){
        return properties.getProperty("URL");
    }

    public String getUsername(){
        return properties.getProperty("USERNAME");
    }

    public String getPassword(){
        return properties.getProperty("PASSWORD");
    }

    public String getBrowser(){
        return properties.getProperty("BROWSER");
    }
}
