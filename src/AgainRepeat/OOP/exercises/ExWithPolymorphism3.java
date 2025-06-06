package AgainRepeat.OOP.exercises;

import java.util.Scanner;

public class ExWithPolymorphism3 {
    public static void main(String[] args) {
        PaymentMethod[] paymentMethods = {
                new CreditCardPayment(),
                new PayPalPayment(),
                new CryptoPayment()
        };
        Scanner sc = new Scanner(System.in);
        String[] methodNames = {"Карта", "PayPal", "Крипта"};
        for (int i = 0; i < paymentMethods.length; i++) {
            System.out.print("Введите сумму для оплаты через " + methodNames[i] + ": ");
            double amount = sc.nextDouble();
            paymentMethods[i].pay(amount);
        }

    }
}


interface PaymentMethod {
    void pay(double amount);
}
class CreditCardPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Оплата картой: " + amount);
    }
}

class PayPalPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Оплата через PayPal: " + amount);
    }
}


class CryptoPayment implements PaymentMethod {


    @Override
    public void pay(double amount) {
        System.out.println("Оплата криптовалютой: " + amount);
    }
}