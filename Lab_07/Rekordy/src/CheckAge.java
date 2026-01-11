public class CheckAge {

    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Wiek musi wynosić co najmniej 18!!!!");
        }
        System.out.println("Wiek " + age + " jest okej");
    }
}
