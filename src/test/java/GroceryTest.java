import junit.framework.TestCase;
import org.junit.Assert;

public class GroceryTest extends TestCase {

    public void testTestGetName() {
        Grocery item = new Grocery("Apple", "12", "Fruit", "12/2/2022");
        String expected = "Apple";
        String actual = item.getName();
        Assert.assertEquals(actual, expected);
    }

    public void testTestSetName() {
        Grocery item = new Grocery("Orange", "12", "Fruit", "12/2/2022");
        String expected = "Apple";
       item.setName("Apple");
        String actual = item.getName();
                Assert.assertEquals(actual, expected);
    }

    public void testGetPrice() {
        Grocery item = new Grocery("Apple", "12", "Fruit", "12/2/2022");
        String expected = "12";
        String actual = item.getPrice();
        Assert.assertEquals(actual, expected);
    }

    public void testSetPrice() {
        Grocery item = new Grocery("Apple", "12", "Fruit", "12/2/2022");
        String expected = "15";
        item.setPrice("15");
        String actual = item.getPrice();
                Assert.assertEquals(actual, expected);
    }

    public void testGetType() {
        Grocery item = new Grocery("Apple", "12", "Fruit", "12/2/2022");
        String expected = "Fruit";
        String actual = item.getType();
        Assert.assertEquals(actual, expected);
    }

    public void testSetType() {
        Grocery item = new Grocery("Apple", "12", "Fruit", "12/2/2022");
        String expected = "Food";
        item.setType("Food");
        String actual = item.getType();
                Assert.assertEquals(actual, expected);
    }

    public void testGetDate() {
        Grocery item = new Grocery("Apple", "12", "Fruit", "12/2/2022");
        String expected = "12/2/2022";
        String actual = item.getDate();
        Assert.assertEquals(actual, expected);
    }

    public void testSetDate() {
        Grocery item = new Grocery("Apple", "12", "Fruit", "12/2/2022");
        String expected = "01/05/2021";
        item.setDate("01/05/2021");
        String actual = item.getDate();
                Assert.assertEquals(actual, expected);
    }

    public void testTestEquals() {
    }

    public void testTestHashCode() {
    }
}