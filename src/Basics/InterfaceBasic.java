package Basics;

public class InterfaceBasic {
    public static void main(String[] args) {
        Book book = new Book("Абай жолы", "Мухтар Ауеезов");
        book.print();

    }
}

interface PrintAll {
    void print();

}
//Чтобы класс применил интерфейс, надо использовать ключевое слово implements:
class Book implements PrintAll {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void print() {
        System.out.println("Title: " + title + " author: " + author);
    }
}
