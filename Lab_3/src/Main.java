public class Main {
    public static void main(String[] args) {
        // Obiekt z konstruktorem domyślnym
        Book defaultBook = new Book();
        defaultBook.printInfo();

        System.out.println();

        // Obiekt z konstruktorem z argumentami
        Book customBook = new Book("Wiedźmin", "Andrzej Sapkowski", 1993);
        customBook.printInfo();

        Car car1 = new Car();
        car1.printInfo();

        System.out.println();

        Car car2 = new Car("Toyota", "Corolla");
        car2.printInfo();

        System.out.println();

        Car car3 = new Car("Ford", "Mustang", 2021);
        car3.printInfo();

    }
}
