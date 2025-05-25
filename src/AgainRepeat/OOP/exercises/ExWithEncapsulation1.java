package AgainRepeat.OOP.exercises;


public class ExWithEncapsulation1 {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Abai zholy");
        book.setAuthor("Muhtar Auezov");
        book.setAges(2010);
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getAges());
    }
}

class Book {
    private String title;
    private String author;
    private int ages;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        else this.title = title;
        }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author.isEmpty()) {
            throw new IllegalArgumentException("Author cannot be empty");
        }
        else this.author = author;
    }

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        if (ages < 1500) {
            throw new IllegalArgumentException("Ages cannot be less than 1500");
        } else this.ages = ages;
    }
}