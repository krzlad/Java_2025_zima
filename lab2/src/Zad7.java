public class Zad7 {

    public static int[] odwrocenieTablicy(int[] arr) {
        int[] r = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            r[i] = arr[arr.length - 1 - i];
        }
        return r;
    }

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5};
        int[] r = odwrocenieTablicy(t);

        for (int x : r) System.out.print(x + " ");
    }
}
