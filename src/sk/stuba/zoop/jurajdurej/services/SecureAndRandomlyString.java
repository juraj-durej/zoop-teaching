package sk.stuba.zoop.jurajdurej.services;

import java.nio.charset.Charset;
import java.util.Random;

public class SecureAndRandomlyString {

    public static String getRandomStringBySize(int length){

        byte[] array = new byte[length];
        System.out.println("bytes : " + array);
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));

        return generatedString;
    }
}
