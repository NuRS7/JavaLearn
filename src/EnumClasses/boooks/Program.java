package EnumClasses.boooks;

public class Program {
    public static void main(String[] args) {
        Book book = new Book("Nur", "Author N", Genre.BELLETRE);
        System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getType());

    }
}
