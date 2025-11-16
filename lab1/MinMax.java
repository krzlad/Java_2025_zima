import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int liczba;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        do {
            liczba = sc.nextInt();

            if (liczba >= 0) {
                if (liczba < min) min = liczba;
                if (liczba > max) max = liczba;
            }

        } while (liczba >= 0);

        System.out.println("Najmniejsza: " + min);
        System.out.println("Największa: " + max);
    }
}
