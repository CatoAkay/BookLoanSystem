package src.books;

public class Book {

    String id;
    String author;
    String language;

    public Book(String id, String author, String language) {
        this.id = id;
        this.author = author;
        this.language = language;
    }

    @Override
    public String toString() {
        return
            "Book id: " + id +
                "\nAuthor of the book: " + author +
                "\nLanguage of the book " + language;
    }
}
