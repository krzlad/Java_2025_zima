public class Zad4 {

    public static void main(String[] args) {
        int[] t = new int[20];
        int sum = 0;

        for (int i = 0; i < t.length; i++) {
            t[i] = 1 + (int)(Math.random() * 100);
            sum += t[i];
        }

        System.out.println("Srednia = " + (double)sum / t.length);
    }
}
