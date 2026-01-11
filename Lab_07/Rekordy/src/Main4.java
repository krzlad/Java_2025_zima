public class Main4 {
    public static void main(String[] args) {

        int[] testValues = {5, 17, 18, 20, -2};

        for (int age : testValues) {
            try {
                System.out.println("Sprawdzam wiek: " + age);
                CheckAge.checkAge(age);
            } catch (IllegalArgumentException ex) {
                System.out.println("Błąd: " + ex.getMessage());
            }
            System.out.println();
        }
    }
}
