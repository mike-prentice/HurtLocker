import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static String firstParse = "";
    static String getNameString = "";
    public String readRawDataToString() throws Exception{

        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public static void main(String[] args) throws Exception{
        String output = (new Main()).readRawDataToString();


        JerksonParser jerksonParser = new JerksonParser();
        firstParse = jerksonParser.getFirstParse(output);
        getNameString = jerksonParser.getNameKey(firstParse);
        System.out.println(getNameString);


    }


}
