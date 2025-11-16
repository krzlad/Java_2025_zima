import java.util.Scanner;

public class SumaPrzedziału {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj n: ");
        int n = sc.nextInt();

        System.out.print("Podaj m: ");
        int m = sc.nextInt();

        int suma = 0;

        for (int i = n; i <= m; i++) {
            suma += i;
        }

        System.out.println("Suma od " + n + " do " + m + " wynosi: " + suma);
    }
}
