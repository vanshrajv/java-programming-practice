class Book {
    String title;
    String author;

    Book() {
        title = "Unknown";
        author = "Unknown";
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Java Basics", "Ravi");
        book1.display();
        book2.display();
    }
}
