import java.util.ArrayList;

public class Category {
    ArrayList<Menu> category = new ArrayList();

    public Category() {
        this.categoryList();
    }

    public void categoryList() {
        this.category.add(new Menu("반미", "당일 생산한 베트남 바게트로 만든 반미"));
        this.category.add(new Menu("로띠", "쫀득하고 납작한 베트남 크레페"));
        this.category.add(new Menu("커피", "베트남 원두로 내린 베트남식 커피"));
        this.category.add(new Menu("주문", "장바구니를 확인 후 주문합니다."));
        this.category.add(new Menu("취소", "진행중인 주문을 취소합니다."));
    }

    public Menu getCategory(int index) {
        return (Menu)this.category.get(index);
    }

    public String mainMenu() {
        int separator = this.category.size() - 2;
        String str = "똣똣카페에 오신걸 환영합니다!\n아래 메뉴판을 보시고 숫자를 입력해주세요. \n[ 똣똣 메뉴 ]\n";

        int i;
        Menu a;
        for(i = 0; i < separator; ++i) {
            a = (Menu)this.category.get(i);
            str = str + (i + 1) + ". " + a.toString() + "\n";
        }

        str = str + "\n[ 주문 메뉴 ] \n";

        for(i = separator; i < this.category.size(); ++i) {
            a = (Menu)this.category.get(i);
            str = str + (i + 1) + ". " + a.toString() + "\n";
        }

        return str;
    }
}