
import java.util.ArrayList;

public class Display {
    public Display() {
    }

    public Item getItem(ArrayList<Item> items, int index) {
        return items.get(index);
    }

    public String getAllItems(ArrayList<Item> items) {
        String menu = "";
        for(int i = 0; i < items.size(); ++i) {
            Item a = items.get(i);
            menu = menu + (i + 1) + ". " + a.toString() + "\n";
        }

        return menu;
    }
}