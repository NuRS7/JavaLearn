package JavaLearnNModel;

public class BankAccount {
    int id;
    String name;
    double balance;

    public static void main(String[] args) {

        BankAccount bA = new BankAccount();
        bA.id = 1;
        bA.name = "Nursultan Yerbakytuly";
        bA.balance = 1_00000_000;

        BankAccount bB = new BankAccount();
        bB.id = 2;
        bB.name = "Zhanna";
        bB.balance =1000;

        BankAccount bC = new BankAccount();
        bC.id = 3;
        bC.name = "Symbat";
        bC.balance = 100;


        System.out.println(bA.id + " " + bA.name + " " + bA.balance);
        System.out.println(bB.id + " " + bB.name + " " + bB.balance);
        System.out.println(bC.id + " " + bC.name + " " + bC.balance);
    }

}
