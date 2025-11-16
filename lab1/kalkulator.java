import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        double a = sc.nextDouble();

        System.out.print("Podaj drugą liczbę: ");
        double b = sc.nextDouble();

        System.out.println("Dodawanie: " + (a + b));
        System.out.println("Odejmowanie: " + (a - b));
        System.out.println("Mnożenie: " + (a * b));
        System.out.println("Dzielenie: " + (b != 0 ? (a / b) : "nie można dzielić przez zero"));
    }
}

