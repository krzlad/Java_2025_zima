package zad5;

public class Animal {
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static <T extends Animal> T findMax(T e1, T e2) {
        return e1.age > e2.age ? e1 : e2;
    }
}