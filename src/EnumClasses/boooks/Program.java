package EnumClasses.boooks;

public class Program {
    public static void main(String[] args) {
        Book book = new Book("Nur", "Author N", Genre.BELLETRE);
        System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getType());
        Genre[] type = Genre.values();
        for (Genre genre : type) {
            System.out.println(genre);
        }
        System.out.println(Genre.SCIENCE.ordinal());
    }
}
