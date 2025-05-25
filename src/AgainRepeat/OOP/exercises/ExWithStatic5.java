package AgainRepeat.OOP.exercises;

public class ExWithStatic5 {
    public static void main(String[] args) {
        Library.Book book = new Library.Book();
        book.printInfo();

    }
}

class Library {
    static class Book {

        void printInfo() {
            System.out.println("Это книга из библиотеки");
        }
    }
}
