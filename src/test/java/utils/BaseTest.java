package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    public static Properties getConstantsProperties() {
        Properties prop = new Properties();
        try {
            FileInputStream input = new FileInputStream("constants.properties");
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop;
    }
}
