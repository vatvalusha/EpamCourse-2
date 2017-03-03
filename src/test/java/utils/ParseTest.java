package utils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Valerii Artemenko on 28.02.2017.
 */
public class ParseTest {

    @Test
    public void parseTextTest() throws Exception {
        String test = "Java is a computer programming language that is concurrent," +
                " class-based, object-oriented, and specifically designed to have as few implementation dependencies as possible. " +
                "It is intended to let application developers write once, run anywhere.";
        List<String> expected = new ArrayList();
        expected.add("[It is intended to let application developers write once, run anywhere]");
        Parse.parseText(test);
        assertEquals(expected.get(0), Parse.getTextSentence().getListSentence().get(1).toString());
    }

}