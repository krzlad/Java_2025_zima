public class Zad2 {

    public static double potegaSiedem(int n) {
        double result = 1.0;
        for (int i = 0; i < n; i++) {
            result /= 7.0;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(potegaSiedem(3));
    }
}
