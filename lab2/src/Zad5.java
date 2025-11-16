public class Zad5 {

    public static void main(String[] args) {
        int[] t = new int[30];
        int ilosc= 0;

        for (int i = 0; i < t.length; i++) {
            t[i] = 1 + (int)(Math.random() * 100);
            int root = (int)Math.sqrt(t[i]);
            if (root * root == t[i]) ilosc++;
        }

        System.out.println("Kwadraty: " + ilosc);
    }
}
