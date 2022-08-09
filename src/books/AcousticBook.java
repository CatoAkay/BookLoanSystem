package src.books;

public class AcousticBook extends Book {

    String freeTrialPeroid;

    public AcousticBook(String id, String author, String language, String freeTrialPeroid) {
        super(id, author, language);
        this.freeTrialPeroid = freeTrialPeroid;
    }

    @Override
    public String toString() {
        return "\n--THIS IS A ACOUSTICBOOK--" +
            "\nFree trial peroid: " + freeTrialPeroid +
            "\nBook id: " + id +
            "\nAuthor of the book: " + author +
            "\nLanguage: " + language;
    }
}
