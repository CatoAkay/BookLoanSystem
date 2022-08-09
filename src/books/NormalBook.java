package src.books;

public class NormalBook extends Book {

    int numberOfHardCopies;
    String loanPeroid;
    int year;

    public NormalBook(String id, String author, String language, int year, int numberOfHardCopies, String loanPeroid) {
        super(id, author, language);
        this.year = year;
        this.numberOfHardCopies = numberOfHardCopies;
        this.loanPeroid = loanPeroid;
    }

    @Override
    public String toString() {
        return "\n--THIS IS A NORMAL BOOK--" +
            "\nBook id: " + id +
            "\nAuthor of the book: " + author +
            "\nLanguage of the book: " + language +
            "\nYear of the book: " + year +
            "\nNumber of hard copies left: " + numberOfHardCopies +
            "\nLoan peroid: " + loanPeroid;
    }
}
