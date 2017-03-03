package utils;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.Assert.*;

/**
 * Created by Valerii Artemenko on 28.02.2017.
 */
public class TXTReaderTest {

    /**
     * @throws Exception
     */
    @Test
    public void readTestTrueEquals() throws Exception {
        File file = new File("C:\\Users\\vatva\\IdeaProjects\\EpamCourse-2\\src\\main\\java\\docs","test.txt");
        String expected = "Java is a computer programming language that is concurrent, " +
                "class-based, object-oriented, and specifically designed to have as few " +
                "implementation dependencies as possible." +
                " It is intended to let application developers write once, run anywhere.";
        assertEquals(expected,new TXTReader().read(file));
    }

    /**
     * @throws RuntimeException
     */
    @Test(expected = RuntimeException.class)
    public void fileIsEmptyTest() throws Exception {
        File file = new File("C:\\Users\\vatva\\IdeaProjects\\EpamCourse-2\\src\\main\\java\\docs","empty.txt");
        new TXTReader().read(file);

    }

    /**
     *
     * @throws FileNotFoundException
     */
    @Test(expected = FileNotFoundException.class)
    public void readFileNotFoundExceptionTest() throws Exception {
        File file = new File("");
        assertEquals("FileNotFoundException",new TXTReader().read(file));
    }

}