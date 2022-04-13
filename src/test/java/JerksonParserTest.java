import junit.framework.TestCase;
import org.junit.Assert;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JerksonParserTest extends TestCase {
public List grocery;
JerksonParser jerksonParser = new JerksonParser();

    public void parseString(){

    }

    public void testGetFirstParse() {
        String original = "naMe:;price:3.23;type:Food^expiration:1/04/2016##";
        String expected = "naMe:;price:3.23;type:Foodexpiration:1/04/2016";
        String actual = String.valueOf(jerksonParser.getFirstParse(original));
        Assert.assertEquals(expected, actual);
    }

    public void testGetNameKey() {
        String original = "naMe:;price:3.23;type:Food^expiration:1/04/2016##";
        String expected = "naMe";
        String actual = jerksonParser.getNameKey(original);
        Assert.assertEquals(expected, actual);
    }
}