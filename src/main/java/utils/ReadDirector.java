package utils;

import java.io.File;

/**
 * Created by Valerii Artemenko on 26.02.2017.
 */
public class ReadDirector {

    private FileReader reader;

    public void setReader(FileReader reader) {
        this.reader = reader;
    }

    /**
     * @param file
     * @return
     */
    public String read(File file){
        if(file.getName().contains(".txt"))
            setReader(new TXTReader());
        else if(file.getName().contains(".doc"))
            setReader(new DOCReader());
        try {
            return reader.read(file);
        } catch (Exception e) {
            e.getStackTrace();
            return null;
        }
    }
}
