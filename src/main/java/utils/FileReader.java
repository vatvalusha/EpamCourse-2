package utils;

import java.io.File;
import java.io.IOException;

/**
 * Created by Valerii Artemenko on 25.02.2017.
 */
public interface FileReader {

    /**
     * @return file File .txt .doc ...
     * @return all text in one String
     * @throws IOException
     */
    String read(File file) throws Exception;
}
