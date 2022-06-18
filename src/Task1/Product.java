package Task1;

public class Product {
    private String id;
    private String name;
    private double price;
    private String honorary_code;
    private String state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getHonorary_code() {
        return honorary_code;
    }

    public void setHonorary_code(String honorary_code) {
        this.honorary_code = honorary_code;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public static void startSale(){}
    public static void raisePrice(){}
    public static  void withdraw(){}
    public static void giveToTheWinner(){}

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", honorary_code='" + honorary_code + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
