public class Book {
    String title;

    String author;

    int publicationYear;

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

    public void printInfo(){
        System.out.println("Tytuł: " + title);
        System.out.println("Autor: " + author);
        System.out.println("Rok wydania: " + publicationYear);
    }
}
