package language;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

/**
 * Created by Valerii Artemenko on 28.02.2017.
 */


public class DictionaryTest {
    Dictionary dictionary;
    Map<String, Word> wordMap;
    Word word1;
    Word word2;
    Word word3;
    Word word4;

    @Before
    public void init() {
        dictionary = new Dictionary();
        wordMap = new TreeMap<String, Word>();
        word1 = new Word("apple");
        word2 = new Word("orange");
        word3 = new Word("banana");
        word4 = new Word("apple");
    }

    @After
    public void clear() {
        dictionary = null;
        wordMap = null;
    }

    /**
     * @throws Exception
     */
    @Test
    public void getWordTest() throws Exception {
        Dictionary.getWord("apple");
        Dictionary.getWord("orange");
        Dictionary.getWord("banana");
        wordMap.put("apple", word1);
        wordMap.put("orange", word2);
        wordMap.put("banana", word3);
        wordMap.put("apple", word4);
        Field f = Dictionary.class.getDeclaredField("wordMap");
        f.setAccessible(true);
        Map<String,Word> list = (Map<String, Word>) f.get(dictionary);
        assertEquals(wordMap.toString(),list.toString());

    }

}