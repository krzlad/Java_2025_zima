public class Main1 {
    public static void main(String[] args) {
        BookDTO b1 = new BookDTO("Wiedźmin krew elfów", "Andrzej Sapkowski", 50.00, 1994);
        BookDTO b2 = new BookDTO("Lord of the Rings", "John Tolkien", 70.00, 1954);
        BookDTO b3 = new BookDTO("Dune", "Frank Herbert", 49.50, 1965);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
