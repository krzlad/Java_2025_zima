public class Zad8 {

    public static String zamiana(String s) {
        if (s.length() < 2) return s;
        char first = s.charAt(0);
        char last = s.charAt(s.length() - 1);
        return last + s.substring(1, s.length() - 1) + first;
    }

    public static void main(String[] args) {
        System.out.println(zamiana("ćie wiem co tu napisaN"));
    }
}
