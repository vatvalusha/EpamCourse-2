import utils.TXTReader;
import utils.FileReader;
import utils.Parse;

import java.io.File;

/**
 * Created by Valerii Artemenko on 25.02.2017.
 */
public class TestMain {


    public static void main(String[] args)  {
/*        FileReader fl = new TXTReader();
        File file = new File("C:\\Users\\vatva\\IdeaProjects\\EpamCourse-2\\src\\main\\java\\docs","file.txt");
        System.out.println(Parse.parseText(fl.read(file)));*/
        new Controller(new View()).start();
    }

}

