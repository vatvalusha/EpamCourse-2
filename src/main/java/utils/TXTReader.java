package utils;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by Valerii Artemenko on 25.02.2017.
 */
public class TXTReader implements FileReader{
    /**
     * @param file
     * @return
     * @throws Exception
     */
    public String read(File file) throws Exception{
        if(file.exists() && file.length() == 0) throw new RuntimeException();
        String text = "";
        java.io.FileReader input = new java.io.FileReader(file);
        int data = input.read();
        while (data != -1){
            text += (char)data;
            data = input.read();
        }
        input.close();
        return text;
    }
}
