package language;


import java.util.LinkedList;
import java.util.List;

/**
 * Created by Valerii Artemenko on 25.02.2017.
 */
public class Sentence implements Comparable<Sentence> {

    //sentence is list of word
    private List<Word> words;

    public Sentence(){
        words = new LinkedList<Word>();
    }

    public void addWord(Word word){
        words.add(word);
    }



    //@return size of sentence
    private int size() {

        int size = 0;
        for(Word word: words){
            size += word.length();
        }
        return size;
    }

    //@Override the compare
    public int compareTo(Sentence o) {
        return Integer.compare(o.size(),size());
    }

    @Override
    public String toString() {
        return "" + words;
    }
}
