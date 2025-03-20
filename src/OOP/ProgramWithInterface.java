package OOP;

public class ProgramWithInterface {
    public static void main(String[] args) {
        Book book = new Book("Абай жолы", " Мухтар Ауезов");
        book.print();
        Journal journal = new Journal("New magazine");
        journal.print();

        Printable p = new Journal("Hello");
        p.print();
        String name = ((Journal) p).getName();
        System.out.println(name);
    }
}
interface Printable {
    void print();
}

class Book implements Printable {
    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void print() {
        System.out.println(name+" "+author);
    }
}


class Journal implements Printable {
    private String name;

    String getName() {
        return name;
    }
    public Journal(String name) {
        this.name = name;
    }
    public void print() {
        System.out.println(name);
    }
}
