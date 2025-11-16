import java.util.Scanner;

public class Podzielne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj a: ");
        int a = sc.nextInt();

        System.out.print("Podaj b: ");
        int b = sc.nextInt();

        System.out.print("Podaj c: ");
        int c = sc.nextInt();

        for (int i = b + 1; i <= a; i++) {
            if (i % c == 0) {
                System.out.println(i);
            }
        }
    }
}
