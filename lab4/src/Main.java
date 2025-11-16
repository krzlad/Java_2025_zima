import animals.Cat;
import animals.Dog;
public class Main {
    public static void main(String[] args){
        Dog dog = new Dog("Pluto", 4);
        Cat cat = new Cat("Filemon", 10);

        dog.makeSound();
        cat.makeSound();

        System.out.println(dog.name + " ma " + dog.age + " lata.");
        System.out.println(cat.name + " ma " + cat.age + " lat.");
    }
}
