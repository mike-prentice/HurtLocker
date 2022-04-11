import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.util.List;

public class Main {
    static String groceryList;
    static String groceryList1;
    public String readRawDataToString() throws Exception{

        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public static void main(String[] args) throws Exception{
        String output = (new Main()).readRawDataToString();
        System.out.println(output);

        JerksonParser jerksonParser = new JerksonParser();
        groceryList = jerksonParser.getGroceries(output);
        jerksonParser.removeSemis(groceryList);
        //groceryList1 = jerksonParser.getKeysAndValues(groceryList);

    }


}
