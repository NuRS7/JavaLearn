package EnumClasses.boooks;


public class Book {
    private String title;
    private String author;
    private Genre TypeBook;
    public Book(String title, String author, Genre genre) {
        this.title = title;
        this.author = author;
        this.TypeBook = genre;

    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    String getType(){
        switch (TypeBook) {
            case SCIENCE -> {
                return "Science";
            }
            case PHANTASY -> {
                return "Phantasy";
            }
            case SCIENCE_FICTION -> {
                return "Science Fiction";
            }
            case BELLETRE -> {
                return "Belletre";
            }
            default -> {
                return "Unknown";
            }
        }
    }

}
