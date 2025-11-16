public class Zadanie {
    public static void main(String[] args) {
        double a = 5;
        double b = 10;
        double c = 3;
        double d = 20;

        a += 4;                 // a = a + 4
        b -= a;                 // b = b - a
        c *= (2 - 4 * a);       // c = c * (2 - 4 * a)
        d /= (4 - a * a);       // d = d / (4 - a^2)

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
