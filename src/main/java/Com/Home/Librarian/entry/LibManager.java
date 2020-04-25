package Com.Home.Librarian.entry;
import java.text.ParseException;

import Com.Home.Librarian.entity.Book;
import Com.Home.Librarian.entity.LibBook;
import Com.Home.Librarian.library.Librarian;
import Com.Home.Librarian.library.Library;
import Com.Home.Librarian.library.Reader;

public class LibManager {
    public static void main(String[] args) {
        Library library = new Library();
        Librarian librarian = new Librarian(library);
        Reader reader = new Reader("Katya");

        try {
            librarian.addBook(new Book("Евгений Онегин", "Пушкин А.С.", "01.01.1832"));
            librarian.addBook(new Book("Капитанская дочь", "Пушкин А.С.", "02.10.1836"));
            librarian.addBook(new Book("Тонкий и толстый", "Чехов А.П.", "01.10.1883"));
            librarian.addBook(new Book("Каштанка", "Чехов А.П.", "10.12.1887"));
            librarian.addBook(new Book("Анна Корениа", "Толстой Л.", "25.03.1878"));
            librarian.addBook(new Book("Мастер и Маргарита", "Булгаков М.А", "08.08.1962"));
            System.out.println(library.viewAllBooks());
            System.out.println(library.find(new Book("Анна Корениа", "Толстой Л.", "25.03.1878")));
            System.out.println(library.getByAuthor("Толстой Л."));
            librarian.removeBook(new Book("Анна Корениа", "Толстой Л.", "25.03.1878"), reader);
            librarian.viewAllTakenBooks();
            librarian.putBookInLibrary(reader);
            librarian.viewReaderData(reader.IDReader);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
