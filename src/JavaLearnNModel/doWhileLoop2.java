package JavaLearnNModel;

public class doWhileLoop2 {
    public static void main(String[] args) {
        int money = 100;

        do {

            System.out.println("Хотите играть? ");
            System.out.println("Вы проиграли");
            money -= 10;
            System.out.println(money);


        }
        while (money > 0);

    }



}
