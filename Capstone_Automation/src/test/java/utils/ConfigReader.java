package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties prop = new Properties();

    static {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\v-rajankit\\eclipse-workspace\\Capstone_Automation\\Config.properties");
            prop.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("Config.properties not found!");
        }
    }

    public static String get(String key) {
        return prop.getProperty(key);
    }
}
