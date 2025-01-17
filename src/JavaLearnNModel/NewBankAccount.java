package JavaLearnNModel;

import java.util.Scanner;
public class NewBankAccount {
    int id;
    String name;
    double balance;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            NewBankAccount bank = new NewBankAccount();
            bank.id = sc.nextInt();
            sc.nextLine();
            bank.name = sc.nextLine();
            bank.balance = sc.nextDouble();
            System.out.println(bank.id +" "+ bank.name +" "+ bank.balance);


        }
    }
}
