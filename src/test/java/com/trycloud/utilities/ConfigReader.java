package com.trycloud.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    // 1. Creating the object of Properties class
    //We need properties class to use methods coming from class like load(), getProperty("key")
    //it is static because we using it in static method
    //It is private because I will be using only in this class

   private static Properties properties = new Properties();

    static{
        try{
            //2. Creating object of FileInputStream
            FileInputStream file = new FileInputStream("configuration.properties");

            //3. Loading the properties object using FileInputStream object
            //Load "properties" object with the "file" we opened using FileInputStream
            properties.load(file);

            //close the file after loading
            //if we do not close the file, it will take space from computer memory
            file.close();

        }catch(IOException e){
            e.printStackTrace();

        }
    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }
}
