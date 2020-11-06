package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties configFile;

    //We use static block since it executes only ones.
    static {

        try {
            FileInputStream fileInputStream = new FileInputStream("configuration.properties");
            configFile = new Properties();
            configFile.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println("File was not loaded to ConfigurationReader class");
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        return configFile.getProperty(key);
    }


}
