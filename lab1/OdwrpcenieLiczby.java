import java.util.Scanner;

public class OdwrpcenieLiczby {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj liczbę dodatnią: ");
        int n = sc.nextInt();

        int odwrocona = 0;

        while (n > 0) {
            int cyfra = n % 10;        // bierzemy ostatnią cyfrę
            odwrocona = odwrocona * 10 + cyfra; // dokładamy do wyniku
            n /= 10;                   // obcinamy ostatnią cyfrę
        }

        System.out.println("Odwrocona liczba: " + odwrocona);
    }
}
