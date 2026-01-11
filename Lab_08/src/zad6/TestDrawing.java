package zad6;

public class TestDrawing {
    public static void main(String[] args) {
        Circle kolo = new Circle();

        kolo.draw();

        kolo.setColor("Czerwony");

        kolo.draw();

        kolo.setColor("Niebieski");
        kolo.draw();
    }
}