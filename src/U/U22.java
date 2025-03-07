package U;

 class Book {
     private String title;

     public Book(String book) {
         this.title = book;
     }

     public void printBook(Book book) {
         System.out.println("Book: " + book.title);
     }

     public void show() {
         printBook(this);
     }

}
public class U22 {
    public static void main(String[] args) {
        Book book1 = new Book("Java");
        book1.show();
    }
}
