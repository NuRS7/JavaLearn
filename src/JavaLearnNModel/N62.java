package JavaLearnNModel;

import java.util.Scanner;

public class N62 {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        if(age >= 18 && age<=28){
            System.out.println(name+militaryCommissar);
        }


    }
}
