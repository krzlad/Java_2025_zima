package books;

public class Book {
    public String title;
    public String author;
    public int publicationYear;

    public Book(String title, String author, int publicationYear){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void showInfo() {
        System.out.println(title + " - " + author + " (" + publicationYear + ")");
    }
}
