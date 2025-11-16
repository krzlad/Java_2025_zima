public class Zad9 {

    public static void PiramidaCheopsa(char c, int n) {
        for (int i = 1; i <= n; i++) {
            int stars = i * 2 - 1;
            for (int j = 0; j < stars; j++) System.out.print(c);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PiramidaCheopsa('*', 3);
    }
}
