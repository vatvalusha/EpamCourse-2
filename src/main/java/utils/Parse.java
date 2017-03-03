package utils;

import language.Dictionary;
import language.Sentence;
import language.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Valerii Artemenko on 25.02.2017.
 */
public class Parse {

   public static Text textSentence;

    private static final String REGEX_MARK = "[.]{3}|\\.|\\?|!";
    private static final String REGEX_SENTENCE_MARK = ", :";

    public static List<Sentence> parseText(String text){
        textSentence = new Text();
        List<Sentence> list = new ArrayList<Sentence>();

        String [] all = text.split(REGEX_MARK);
        for(String s : all){
            Sentence sentence = new Sentence();
            for(String c:s.split(REGEX_SENTENCE_MARK)){
                sentence.addWord(Dictionary.getWord(c.trim()));
            }
            list.add(sentence);
            textSentence.addSentence(sentence);
        }
        return list;
    }

    public static Text getTextSentence() {
        return textSentence;
    }

    @Override
    public String toString() {
        return "";
    }
}
