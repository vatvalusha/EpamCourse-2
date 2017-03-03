package language;

/**
 * Created by Valerii Artemenko on 25.02.2017.
 */
public class Word {

    String word;

    public Word(String word) {
        this.word = word;
    }


    public int length() {
        return word.length();
    }

    @Override
    public String toString() {
        return word;
    }
}
