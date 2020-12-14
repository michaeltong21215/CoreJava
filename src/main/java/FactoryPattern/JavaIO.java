package FactoryPattern;

import java.io.*;
import java.util.logging.Logger;

public class JavaIO {
    private static final Logger LOGGER = Logger.getLogger(JavaIO.class.getName());
    public static void main(String[] args) {

        try {
            File file = new File("shapes.txt");
            FileOutputStream oStream = new FileOutputStream(file);
            String content = "Circle: 1";
            byte[] bytes = content.getBytes();
            oStream.write(bytes);
            oStream.close();
            LOGGER.info("something");
        }catch(FileNotFoundException e) {
        }catch(IOException ex){

        }

    }
}

/*

 */