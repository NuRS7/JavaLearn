package JavaLearnNModel;

public class N51 {
    public static void main(String[] args) {
        int money = 100;
        while (money > 0) {
            System.out.println("Хотите продолжить");
            System.out.println("Вы проиграли");
            money = money - 10;
            System.out.println(money);
        }
    }
}
