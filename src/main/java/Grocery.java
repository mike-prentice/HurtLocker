import java.util.Objects;

public class Grocery {
    private String name;
    private int price;
    private String type;
    private String date;

    public Grocery(String name, int price, String type, String date) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grocery grocery = (Grocery) o;
        return price == grocery.price && name.equals(grocery.name) && type.equals(grocery.type) && date.equals(grocery.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, type, date);
    }
}
