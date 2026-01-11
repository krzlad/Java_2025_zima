package zad9;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Nowy konstruktor potrzebny do Zadania 14
    public Person(String name) {
        this.name = name;
        this.age = 0; // Domyślny wiek
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}