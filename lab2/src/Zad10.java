public class Zad10 {

    public static void capitalizeEverySecond(StringBuffer sb) {
        for (int i = 1; i < sb.length(); i += 2) {
            char c = sb.charAt(i);
            sb.setCharAt(i, Character.toUpperCase(c));
        }
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("programowanie");
        capitalizeEverySecond(sb);
        System.out.println(sb);
    }
}
