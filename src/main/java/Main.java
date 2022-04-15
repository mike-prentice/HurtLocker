import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static String firstParse = "";
    static List<String> values = new ArrayList<>();
    public String readRawDataToString() throws Exception{

        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public static void main(String[] args) throws Exception{
        String output = (new Main()).readRawDataToString();


        JerksonParser jerkParse = new JerksonParser();
        firstParse = jerkParse.getFirstParse(output);
        values = jerkParse.getAllValues(firstParse);
        System.out.println(values.toString());
        jerkParse.buildGroceries();


    }


}
