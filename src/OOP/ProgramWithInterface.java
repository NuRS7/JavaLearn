package OOP;

public class ProgramWithInterface {
    public static void main(String[] args) {
        Book book = new Book("Абай жолы", " Мухтар Ауезов");
        book.print();
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
