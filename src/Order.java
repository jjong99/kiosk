import java.util.ArrayList;

public class Order {
    private static int orderNo = 0; // 주문 번호
    private ArrayList<Item> order = new ArrayList<Item>();

    // 생성자
    Order(){}

    // 장바구니에 있는 상품 불러오기
    public Item getItem(int index){
        return order.get(index);
    }

    // 장바구니에 넣기
    public void addItem(Item item){
        order.add(item);
    }

    // 장바구니에서 상품 하나만 삭제하기
    public void removeItem(Item item){
        order.remove(item);
    }
    // 장바구니 비우기
    public void clearOrder(){
        order.clear();
    }

    // 장바구니에 있는 상품 개수 구하기
    public int getSize(){
        return order.size();
    }

    // 주문번호 가져오기
    public int getNumber(){
        return orderNo;
    }

    // 주문번호 증가
    public void incrementNo(){
        orderNo++;
    }

    // toString
    public String toString(){
        String str = "";
        for(int i=0; i < order.size(); i++){
            str += order.get(i).toString() + "\n";
        }
        return str;
    }

}
