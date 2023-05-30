
import java.util.ArrayList;

public class Display {
    public Display() {
    }

    public Item getItem(ArrayList<Item> items, int index) {
        return (Item)items.get(index);
    }

    public String getAllItems(ArrayList<Item> items) {
        String menu = "[ 똣똣 카페 메뉴 ] \n";

        for(int i = 0; i < items.size(); ++i) {
            Item a = (Item)items.get(i);
            menu = menu + (i + 1) + ". " + a.toString() + "\n";
        }

        return menu;
    }
}