public class Zad1 {

    public static int NajwiekszaPierwsza(int n) {
        if (n <= 2) return -1;
        for (int i = n - 1; i >= 2; i--) {
            if (pierwsza(i)) return i;
        }
        return -1;
    }

    private static boolean pierwsza(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(NajwiekszaPierwsza(20));
    }
}
