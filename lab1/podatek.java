import java.util.Scanner;

public class podatek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj dochód: ");
        double dochod = sc.nextDouble();

        double podatek;

        if (dochod <= 85528) {
            podatek = dochod * 0.18;
        } else {
            podatek = 14839.02 + (dochod - 85528) * 0.32;
        }

        System.out.println("Podatek do zapłaty: " + podatek);
    }
}
