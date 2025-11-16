public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        if (firstName == null || firstName.isEmpty()) {
            this.firstName = "";
        } else {
            this.firstName = firstName;
        }

        if (lastName == null || lastName.isEmpty()) {
            this.lastName = "";
        } else {
            this.lastName = lastName;
        }

        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Person: " + firstName + " " + lastName + ", Age: " + age + ".";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Person other = (Person) obj;
        return age == other.age
                && firstName.equals(other.firstName)
                && lastName.equals(other.lastName);
    }

    @Override
    public int hashCode() {
        return (firstName + lastName + age).hashCode();
    }

    public static void main(String[] args) {
        Person p1 = new Person("Kacper", "Nowak", 20);
        Person p2 = new Person("Kacper", "Nowak", 20);
        Person p3 = new Person("Adam", "Kowalski", -5);
        Person p4 = new Person(null, "", 25);

        System.out.println(p1);
        System.out.println(p3);
        System.out.println(p4);

        System.out.println("\nCzy p1 i p2 są równe? " + p1.equals(p2));
        System.out.println("hashCode p1: " + p1.hashCode());
        System.out.println("hashCode p2: " + p2.hashCode());
    }
}
