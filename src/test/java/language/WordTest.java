package language;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Valerii Artemenko on 28.02.2017.
 */
public class WordTest {
    @Test
    public void lengthTest() throws Exception {
    int expected = 9;
    Word word = new Word("Artemenko");
    assertEquals(9, word.length());
    }

}