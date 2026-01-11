package zad6;

public class Circle implements ColorDrawable {
    private String myColor = "biały"; // Domyślny kolor

    @Override
    public void draw() {
        System.out.println("Rysuję koło w kolorze: " + myColor);
    }

    @Override
    public void setColor(String color) {
        this.myColor = color;
        System.out.println("Zmieniono kolor pędzla na: " + color);
    }
}