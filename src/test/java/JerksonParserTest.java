import junit.framework.TestCase;
import org.junit.Assert;



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
        String actual = jerksonParser.getNameKey(original);
        Assert.assertEquals(expected, actual);
    }

    public void testGetNameValue() {
        String original = "naMe:;price:3.23;type:Food^expiration:1/04/2016##";
        String expected = "";
        String actual = jerksonParser.getNameValue(original);
        Assert.assertEquals(expected, actual);
    }
}