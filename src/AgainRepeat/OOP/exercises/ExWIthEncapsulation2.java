package AgainRepeat.OOP.exercises;

public class ExWIthEncapsulation2 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountHolder("12131");
        bankAccount.setBalance(30.1);
        bankAccount.deposit(10.0);
        System.out.println(bankAccount.getAccountHolder());
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(5.0);
        System.out.println(bankAccount.getBalance());
    }
}

class BankAccount {
    private String accountHolder;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        } else this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        if (accountHolder == null || accountHolder.isEmpty()) {
            throw new IllegalArgumentException("Account holder cannot be empty");
        } else this.accountHolder = accountHolder;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        } else {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        } else {
            this.balance -= amount;
        }
    }
}
