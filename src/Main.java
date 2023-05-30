import java.util.ArrayList;
import java.util.Scanner;





public class Main{
    public static void main(String[] args) {
        ArrayList<Item> bahnmis = new ArrayList<>();
        bahnmis.add(new Item("똣똣반미", "다양한 베트남 햄이 들어간 반미", 7.8));
        bahnmis.add(new Item("돼지반미", "불맛가득 돼지고기가 들어간 반미", 7.8));
        bahnmis.add(new Item("새우반미", "매콤한 새우가 들어간 반미", 7.8));
        bahnmis.add(new Item("에그반미", "부드러운 계란 오믈렛이 들어간 반미", 7.8));
        bahnmis.add(new Item("치즈반미", "크림치즈가 들어간 반미", 7.8));

        ArrayList<Item> rotis = new ArrayList<>();
        rotis.add(new Item("누텔라 바나나 로띠", "누텔라와 바나나가 토핑된 로띠", 7.8));
        rotis.add(new Item("계란 바나나 로띠", "계란과 바나나가 토핑된 로띠 연유와 설탕이 올라갑니다.", 7.8));
        rotis.add(new Item("카야 로띠", "카야잼이 들어간 로띠", 7.8));
        rotis.add(new Item("치즈 로띠", "치즈가 들어간 로띠", 7.8));

        Scanner sc = new Scanner(System.in);

        // 장바구니
        Order order = new Order();

        // 메인 화면
        Category c = new Category();
        System.out.println(c.mainMenu());

        // 상품 메뉴판
        Display a = new Display();

        int num1 = sc.nextInt();


        if(num1 == 1){
            System.out.println(a.getAllItems(bahnmis));
            // 메뉴 선택
            int num2 = sc.nextInt();
            int orderNum = num2 - 1;
            // 장바구니에 넣기
            Item selectMenu = a.getItem(bahnmis,orderNum);
            System.out.println(selectMenu);
            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인\t2. 취소");
            int num3 = sc.nextInt();
            if(num3 == 1){
                order.addItem(selectMenu);
                System.out.println(selectMenu.getName()+"가 장바구니에 추가되었습니다.");
                System.out.println(c.mainMenu());
            } else {
                System.out.println(c.mainMenu());
            }

        } else if (num1 == 2) {
            System.out.println(a.getAllItems(rotis));
            // 메뉴 선택
            int num2 = sc.nextInt();
            int orderNum = num2 - 1;
            // 장바구니에 넣기
            Item selectMenu = a.getItem(rotis,orderNum);
            order.addItem(selectMenu);
            System.out.println(order);
        }
        // 메뉴판 불러오기










    }

}
