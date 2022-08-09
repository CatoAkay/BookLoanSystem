package src.main;

import src.books.NormalBook;
import src.books.AcousticBook;

public class main {

    public static void main(String[] args) {
        NormalBook normalBook = new NormalBook("50", "Cato", "Norsk", 2020, 6, "Five months");
        AcousticBook acousticBook = new AcousticBook("12", "Seb", "Engelskk", "Six months");
        System.out.println(normalBook);
        System.out.println(acousticBook);
    }
}
