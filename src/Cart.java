import java.util.ArrayList;

public class Cart {
    private static ArrayList<Item> orderList = new ArrayList<Item>();

    public static void addToCart(Item m){
        orderList.add(m);
    }
    public static void printList()
    {
        System.out.println("your cart contains: ");
        for(Item i : orderList )
        {
            System.out.println(i.getName() + "(s), Costing" + i.getPrice() + "each" );
        }

    }

    public static ArrayList<Item> getOrderList(){
        return orderList;
    }
}
