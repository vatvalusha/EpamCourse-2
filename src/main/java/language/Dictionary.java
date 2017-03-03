package language;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Valerii Artemenko on 25.02.2017.
 */
public class Dictionary {

    private static final Map<String,Word> wordMap = new TreeMap<String, Word>();

    public static Word getWord(String str){
        Word word = wordMap.get(str);
        if(word == null){
            word = new Word(str);
            wordMap.put(str,word);
        }
        return word;
    }

}
