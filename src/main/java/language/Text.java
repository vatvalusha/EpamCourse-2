package language;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Valerii Artemenko on 28.02.2017.
 */
public class Text {

    private List<Sentence> listSentence;

    public Text(){
        listSentence = new ArrayList<Sentence>();
    }

    public void addSentence(Sentence sentence){
        listSentence.add(sentence);
    }

    public List<Sentence> getListSentence() {
        return listSentence;
    }

    public int size(){
        if(listSentence.size() == 0) throw new IllegalArgumentException();
        return listSentence.size();
    }

    @Override
    public String toString() {
        return ""+listSentence;
    }
}
