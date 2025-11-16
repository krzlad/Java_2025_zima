public class Book {
    public String title;
    public String author;
    public int publicationYear;

    public Book(){
        title = "Nieznany tytuł";
        author = "Nieznany autor";
        publicationYear = 0;
    }

    public Book(String title, String author, int publicationYear){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public static void main(String[] args){
        Book book1 = new Book();
        System.out.println("Książka 1: " + book1.title + ", " + book1.author + ", " + book1.publicationYear);

        Book book2 = new Book("Wiedźmin Krew Elfów", "Andrzej Sapkowski", 1994);
        System.out.println("Książka 2: " + book2.title + ", " + book2.author + ", " + book2.publicationYear);

    }

}

