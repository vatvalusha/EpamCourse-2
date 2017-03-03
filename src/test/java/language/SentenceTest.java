package language;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

/**
 * Created by Valerii Artemenko on 28.02.2017.
 */
public class SentenceTest {
    Sentence sentence;
    List<Word> listSentence;
    Word word1;
    Word word2;
    Word word3;
    Word word4;

    @Before
    public void init() {
        sentence = new Sentence();
        listSentence = new ArrayList<Word>();
        word1 = new Word("apple");
        word2 = new Word("orange");
        word3 = new Word("banana");
        word4 = new Word("apple");
    }

    @After
    public void clear() {
        sentence = null;
        listSentence = null;
    }

    /**
     * @throws Exception
     */
    @Test
    public void addWordTest() throws Exception {
        listSentence.add(word1);
        listSentence.add(word2);
        listSentence.add(word3);
        sentence.addWord(word1);
        sentence.addWord(word2);
        sentence.addWord(word3);
        Field f = Sentence.class.getDeclaredField("words");
        f.setAccessible(true);
        List<Word> words = (List<Word>) f.get(sentence);
        assertEquals(listSentence.toString(), words.toString());
    }

    /**
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     * testing length sentence with expected result
     */
    @Test
    public void sizeSentenceTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = Sentence.class.getDeclaredMethod("size");
        method.setAccessible(true);
        int expected = 11;
        sentence.addWord(word1);
        sentence.addWord(word2);
        assertEquals(expected,method.invoke(sentence));
    }

}