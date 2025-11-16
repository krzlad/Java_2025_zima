public class Test_Property {
    public static void main(String[] args) {
        House h1 = new House("Olsztyn, Jaroty 5", 120.0, 500000.0, 2);
        House h2 = new House("Olsztyn, Jaroty 5", 120.0, 500000.0, 2);
        Apartment a1 = new Apartment("Warszawa, Centrum 12", 60.0, 400000.0, 3);
        Apartment a2 = new Apartment("Warszawa, Centrum 12", 60.0, 400000.0, 3);

        System.out.println(h1);
        System.out.println(a1);

        System.out.println("\nCzy h1 i h2 są równe? " + h1.equals(h2));
        System.out.println("Czy a1 i a2 są równe? " + a1.equals(a2));

        System.out.println("\nHashCode h1: " + h1.hashCode());
        System.out.println("HashCode h2: " + h2.hashCode());
        System.out.println("HashCode a1: " + a1.hashCode());
        System.out.println("HashCode a2: " + a2.hashCode());
    }
}
