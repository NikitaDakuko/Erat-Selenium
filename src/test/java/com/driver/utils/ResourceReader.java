package com.driver.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class ResourceReader {
    protected static Properties props;

    //private static ResourceBundle resourceBundle = ResourceBundle.getBundle(System.getProperty("environment"));

    public static String get(String key){
        props = new Properties();
        try {
            props.load(new FileInputStream("src/test/TestProperties.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return props.getProperty(key);
    }
}