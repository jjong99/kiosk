import java.util.ArrayList;

// 메뉴 목록 불러오기

public class Display {
    // 생성자
    public Display() {}
    public Item getItem(ArrayList<Item> items, int index) {
        return items.get(index);
    }
    public String getAllItems(ArrayList<Item> items){
        String menu = "[ 똣똣 카페 메뉴 ] \n";
        for(int i=0; i < items.size(); i++){
            Item a = items.get(i);
            menu += (i+1) + ". " + a.toString() + "\n";
        }
        return menu;
    }
}
