package games;

public class Game {
    public String title;

    public Game(String title) {
        this.title = title;
        System.out.println("Tytuł = " + title);
    }

    public final void initialize() {
        System.out.println("Dane gry ....");
    }

    public void show() {
        System.out.println("Gra: " + title);
    }
}
