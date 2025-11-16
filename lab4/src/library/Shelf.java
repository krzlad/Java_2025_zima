package library;

import books.Book;

public class Shelf {
    public Book[] books;
    public int count;

    public Shelf(int maxBooks) {
        books = new Book[maxBooks];
        count = 0;
    }

    public void addBook(Book b){
        if(count < books.length){
            books[count] = b;
            count++;
            System.out.println("Dodano książkę: " + b.title);
        } else {
            System.out.println("Na półce nie ma miejsca na nowa książkę! ");
        }
    }

    public void removeBook(int index){
        if(index >= 0 && index < count){
            System.out.println("Usunięto książkę: " + books[index].title);
            for (int i = index; i<count-1;i++){
                books[i] = books[i+1];
            }
            books[count-1] = null;
            count--;
        } else{
            System.out.println("Nie ma książki o takim indeksie! ");
        }
    }

    public  void showBooks(){
        if(count==0){
            System.out.println("Półka jest pusta... ");
        } else {
            System.out.println("\nZawartość półki: ");
            for(int i=0;i<count;i++){
                books[i].showInfo();
            }
        }
    }
}
