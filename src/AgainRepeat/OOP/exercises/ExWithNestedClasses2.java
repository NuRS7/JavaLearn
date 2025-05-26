package AgainRepeat.OOP.exercises;


public class ExWithNestedClasses2 {
    public static void main(String[] args) {
        Library1 library1 = new Library1("Astana central library", "Astana, Seifullina 11");
        Library1.Book2 book2 = library1.new Book2("Abai zholy", "Muhtar Auezov");
        book2.printDetails();
    }
}

class Library1 {
    private String name;
    private String location;

    Library1(String name, String location) {
        this.name = name;
        this.location = location;
    }

    class Book2 {
        private String title;
        private String author;

        Book2(String titleBook, String authorBook) {
            this.title = titleBook;
            this.author = authorBook;
        }
        void printDetails() {
            System.out.println(" Book " + title + " by " + author + " is in library " + name + " located at " + location);
        }
    }
}

