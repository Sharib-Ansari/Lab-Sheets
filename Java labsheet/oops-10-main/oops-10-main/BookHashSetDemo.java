import java.util.HashSet;
import java.util.Objects;

class Book {
    int id;
    String title, author;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println(id + " " + title + " " + author);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Book)) return false;
        Book b = (Book) obj;
        return id == b.id;
    }

    public int hashCode() {
        return Objects.hash(id);
    }
}

public class BookHashSetDemo {
    public static void main(String[] args) {
        HashSet<Book> books = new HashSet<>();

        books.add(new Book(1, "Java", "James"));
        books.add(new Book(2, "Python", "Guido"));
        books.add(new Book(1, "Java Basics", "John"));

        for (Book b : books) {
            b.display();
        }
    }
}