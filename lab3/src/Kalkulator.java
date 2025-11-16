public class Kalkulator {

    private boolean sprawdzDane(int a, int b) {
        if (a < 0 || b < 0) {
            System.out.println("Jedna z liczb jest ujemna!");
            return false;
        }
        return true;
    }

    public int obliczSume(int a, int b) {
        if (!sprawdzDane(a, b)) {
            return -1;
        }
        return a + b;
    }
}
