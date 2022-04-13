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

    public void testGetGroceries() {
        String original = "naMe:;price:3.23;type:Food^expiration:1/04/2016##";
        String expected = "naMe:;price:3.23;type:Foodexpiration:1/04/2016";
        String modified = String.valueOf(jerksonParser.getFirstParse(original));
        Assert.assertEquals(expected, modified);
    }
}