import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class JerksonParserTest extends TestCase {
JerksonParser jerksonParser = new JerksonParser();

    public void testGetFirstParse() {
        String original = "naMe:;price:3.23;type:Food^expiration:1/04/2016##";
        String expected = "naMe:;price:3.23;type:Foodexpiration:1/04/2016";
        String actual = String.valueOf(jerksonParser.getFirstParse(original));
        Assert.assertEquals(expected, actual);
    }

    public void testGetNameKey() {
        String original = "naMe:;price:3.23;type:Food^expiration:1/04/2016##";
        String expected = "naMe";
        String actual = jerksonParser.getKey(original, jerksonParser.findName);
        Assert.assertEquals(expected, actual);
    }

    public void testGetNameValue() {
        String original = "naMe:;price:3.23;type:Food^expiration:1/04/2016##";
        List<String> list = new ArrayList<>();
        list.add("");
        int expected = list.size();
        List<String> actual = jerksonParser.getValue(original, jerksonParser.findNameValue);
        Assert.assertEquals(expected, actual.size());
    }
    public void testGetTypeValue() {
        String original = "naMe:;price:3.23;type:Food^expiration:1/04/2016##";
        List<String> expected = Collections.singletonList("Food^");
        List<String> actual = jerksonParser.getValue(original, jerksonParser.findTypeValue);
        //System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }
}