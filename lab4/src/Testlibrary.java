import books.Book;
import library.Shelf;

public class Testlibrary {
    public static void main(String[] args){
        Shelf shelf = new Shelf(3);

        Book b1 = new Book("Uga Buga Bum Szakalaka", "Jakiś Jaskiniowiec", 1953);
        Book b2 = new Book("Dragon Ball Z", "Akira Toriyama", 1985);
        Book b3 = new Book("Java jest fajna", "Wiktor Czarnota", 2025);

        shelf.addBook(b1);
        shelf.addBook(b2);
        shelf.addBook(b3);

        shelf.showBooks();

        System.out.println("\n Usuwamy książkę nr.1: ");
        shelf.removeBook(0);

        shelf.showBooks();
    }
}
