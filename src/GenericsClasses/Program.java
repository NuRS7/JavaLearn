package GenericsClasses;

public class Program {
    public static void main(String[] args) {
        Accountable<String> accountable = new Account("123", 13);
        Account account = new Account("1234", 13);
        System.out.println(account.getId());

    }
}
