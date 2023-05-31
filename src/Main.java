import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ArrayList<Item> bahnmis = new ArrayList<>();
        bahnmis.add(new Item("똣똣반미", "베트남 햄 세가지가 들어간 반미", 7.8));
        bahnmis.add(new Item("돼지반미", "불맛가득 돼지고기가 들어간 반미", 7.8));
        bahnmis.add(new Item("새우반미", "매콤한 새우가 들어간 반미", 7.8));
        bahnmis.add(new Item("에그반미", "부드러운 계란 오믈렛이 들어간 반미", 7.8));
        bahnmis.add(new Item("치즈반미", "크림치즈가 들어간 반미", 7.8));
        ArrayList<Item> rotis = new ArrayList<>();
        rotis.add(new Item("누텔라바나나로띠", "누텔라와 바나나가 토핑된 로띠", 7.8));
        rotis.add(new Item("계란바나나로띠", "계란과 바나나가 토핑된 로띠 연유와 설탕이 올라갑니다.", 7.8));
        rotis.add(new Item("카야로띠", "카야잼이 듬뿍 들어간 로띠", 7.8));
        rotis.add(new Item("치즈로띠", "체다 & 모짜렐라 치즈가 들어간 로띠", 7.8));
        ArrayList<Item> coffee = new ArrayList<>();
        coffee.add(new Item("블랙커피", "베트남식 아메리카노", 3.0));
        coffee.add(new Item("연유커피", "베트남 연유가 들어간 달달한 커피", 4.0));
        coffee.add(new Item("에그커피", "달콤한 계란크림이 들어간 커피", 4.5));
        coffee.add(new Item("아보카도커피", "아보카도를 갈아 베트남 커피를 곁들인 스무디", 5.3));
        Scanner sc = new Scanner(System.in);
        Order order = new Order();
        Display a = new Display();
        Category c = new Category();

            while(true) {

                // 1. 메인 화면
                System.out.println(c.mainMenu());
                int num1 = sc.nextInt();
                int num4;
                int num5;
                Item selectMenu;
                int num3;

                // 2. 상품 메뉴판 화면
                if (num1 == 1) {
                    System.out.println("[ 반미 메뉴 ]\n");
                    System.out.println(a.getAllItems(bahnmis));

                    // 3. 장바구니에 추가
                    num4 = sc.nextInt();
                    num5 = num4 - 1;
                    selectMenu = a.getItem(bahnmis, num5);
                    System.out.println(selectMenu);
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인\t2. 취소");
                    num3 = sc.nextInt();
                    if (num3 == 1) {
                        order.addItem(selectMenu);
                        System.out.println(selectMenu.getName() + "가 장바구니에 추가되었습니다.\n\n");
                    } else if (num3 == 2) {
                        // continue mainMenu;
                    }
                } else if (num1 == 2) {
                    System.out.println("[ 로띠 메뉴 ]\n");
                    System.out.println(a.getAllItems(rotis));
                    num4 = sc.nextInt();
                    num5 = num4 - 1;
                    selectMenu = a.getItem(rotis, num5);
                    System.out.println(selectMenu);
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인\t2. 취소");
                    num3 = sc.nextInt();
                    if (num3 == 1) {
                        order.addItem(selectMenu);
                        System.out.println(selectMenu.getName() + "가 장바구니에 추가되었습니다.\n\n");
                    } else if (num3 == 2) {
                       // continue mainMenu;
                    }
                } else if (num1 == 3) {
                    System.out.println("[ 커피 메뉴 ]\n");
                    System.out.println(a.getAllItems(coffee));
                    num4 = sc.nextInt();
                    num5 = num4 - 1;
                    selectMenu = a.getItem(coffee, num5);
                    System.out.println(selectMenu);
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인\t2. 취소");
                    num3 = sc.nextInt();
                    if (num3 == 1) {
                        order.addItem(selectMenu);
                        System.out.println(selectMenu.getName() + "가 장바구니에 추가되었습니다.\n\n");
                    } else if (num3 == 2) {
                        // continue mainMenu;
                    }
                } else if (num1 == 4) {
                    // 4. 주문 화면

                    System.out.println("[ Orders ]\n");
                    System.out.println("아래와 같이 주문 하시겠습니까?");
                    System.out.println(order);
                    System.out.println("[ Total ]");
                    System.out.println("W " + order.getTotalPrice() + "\n");
                    System.out.println("1. 주문\t2. 메뉴판");
                    num4 = sc.nextInt();
                    if (num4 == 1) {
                        // 5. 주문 완료 화면
                        System.out.println(order.orderComplete());
                        order.clearOrder();
                    } else if (num4 == 2) {
                        // 6. 주문 취소 화면
                        System.out.println("진행하던 주문을 취소하시겠습니까?");
                        System.out.println("1. 확인\t2. 취소");
                        num5 = sc.nextInt();
                        if (num5 == 1) {
                            System.out.println("진행하던 주문이 취소되었습니다.\n\n");
                            order.clearOrder();
                        } else if (num5 == 2) {
                            // continue mainMenu;
                        }
                    }
                }
            }

    }
}
