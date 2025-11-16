public class Liczby {
    public static void main(String[] args) {

        int i = 1;
        int policzoneParzyste = 0;
        int policzoneNieparzyste = 0;

        System.out.println("Pierwsze 20 liczb parzystych:");
        do {
            if (i % 2 == 0) {
                System.out.println(i);
                policzoneParzyste++;
            }
            i++;
        } while (policzoneParzyste < 20);

        i = 1;

        System.out.println("\nPierwsze 20 liczb nieparzystych:");
        do {
            if (i % 2 != 0) {
                System.out.println(i);
                policzoneNieparzyste++;
            }
            i++;
        } while (policzoneNieparzyste < 20);
    }
}
