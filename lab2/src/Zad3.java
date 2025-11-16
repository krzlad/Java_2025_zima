public class Zad3 {

    public static int losowaWZakresie(int a, int b) {
        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }
        return a + (int)(Math.random() * (b - a + 1));
    }

    public static void main(String[] args) {
        System.out.println(losowaWZakresie(5, 10));
    }
}
