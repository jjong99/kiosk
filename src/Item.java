import java.util.ArrayList;

public class Item extends Menu {
    private String name;
    private String desc;
    private double price;

    ArrayList<Item> roti = new ArrayList<>();

    public Item(){}
    public Item(String name, String desc, double price){
        super(name, desc);
        this.name = name;
        this.desc = desc;
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "  " + name + "   W" + price + "    " + desc;
    }

}
