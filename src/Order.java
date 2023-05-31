import java.util.ArrayList;

public class Order {
    private static int orderNo = 0; // 주문 번호
    private ArrayList<Item> order = new ArrayList<>();

    // 생성자
    Order(){}

    // 장바구니에 있는 상품 불러오기
    public Item getItem(int index){
        return this.order.get(index);
    }

    // 장바구니에 넣기
    public void addItem(Item item){
        this.order.add(item);
    }

    // 장바구니에서 상품 하나만 삭제하기
    public void removeItem(Item item){
        this.order.remove(item);
    }
    // 장바구니 비우기
    public void clearOrder(){
        this.order.clear();
    }

    // 장바구니에 있는 상품 개수 구하기
    public int getSize(){
        return this.order.size();
    }

    // 장바구니 상품 총가격 구하기
    public double getTotalPrice() {
        double totalPrice = 0.0;
        for(int i=0 ; i < order.size(); i++){
            totalPrice += order.get(i).price;
        }
        return totalPrice;
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
    public String orderComplete() {
        this.incrementNo();
        String str = "\n주문이 완료되었습니다!\n\n대기번호는 [ " + orderNo + " ] 번 입니다.\n";
        return str;
    }

    public String toString() {
        String str = "";
        for(int i = 0; i < this.order.size(); ++i) {
            str = str + this.order.get(i).toString() + "\n";
        }
        return str;
    }

}
