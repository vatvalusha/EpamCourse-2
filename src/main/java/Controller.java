import language.Sentence;
import utils.Parse;
import utils.ReadDirector;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Valerii Artemenko on 26.02.2017.
 */
public class Controller {

    /**
     * @param KEY_WORD_PATTERN for key words in text
     */
    public static final String KEY_WORD_PATTERN = "\\w+?";

    private View view;

    /**
     * @param view created object
     */
    public Controller(View view) {
        this.view = view;
    }

    /**
     *
     */
    public void start() {
        Scanner scanner = new Scanner(System.in);
        view.printToConsole(View.SELECT_FILE_MENU);
        List<File> list = getFileList();
        view.printListToConsole(list);
        int value = inputIntValueWithScanner(scanner);
        while (value > list.size()) {
            value = inputIntValueWithScanner(scanner);
        }
        File file = list.get(value - 1);
        String text = new ReadDirector().read(file);
        List<Sentence> sentences = Parse.parseText(text);
        Collections.sort(sentences);
        view.printListToConsole(sentences);
        System.out.print(View.TOTAL_COUNT_SENTENCE);
        view.printCountSentence(Parse.textSentence);
    }


    /**
     * @return exist files in folder docs
     */
    private List<File> getFileList() {
        File folder = new File("C:\\Users\\vatva\\IdeaProjects\\EpamCourse-2\\src\\main\\java\\docs");
        List<File> list = new ArrayList<File>();
        Collections.addAll(list, folder.listFiles());
        return list;
    }

    /**
     * @param scanner
     * @return int value
     */
    private int inputIntValueWithScanner(Scanner scanner) {

        view.printToConsole(View.INPUT_INT_DATA);
        while (!scanner.hasNextInt()) {
            view.printToConsole(View.WRONG_INPUT_INT_DATA +"\n"+ View.INPUT_INT_DATA);
            scanner.next();
        }
        return scanner.nextInt();
    }
}
