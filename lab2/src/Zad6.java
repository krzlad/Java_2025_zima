public class Zad6 {

    public static int najmniejsza(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    public static void main(String[] args) {
        int[] t = {64,64, 7, 251, 2};
        System.out.println(najmniejsza(t));
    }
}
