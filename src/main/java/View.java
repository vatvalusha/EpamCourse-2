import language.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Valerii Artemenko on 26.02.2017.
 */
public class View {

    public static final String SELECT_FILE_MENU = "select file by number";
    public static final String INPUT_INT_DATA = "input int value please ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong value";
    public static final String TOTAL_COUNT_SENTENCE = "Count sentence in the text: ";

    void printToConsole(String text){
        System.out.println(text);
    }

    void printListToConsole(List<?> list){
        int k = 1;
        for(Object i : list){
            System.out.println(String.valueOf(k++)+ ". "+i);
        }
    }
    void printCountSentence(Text list){
        System.out.print(list.size());
    }

    void printExaption(Exception e){
        System.err.println(e.toString());
    }
}
