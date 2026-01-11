package zad5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LoudAnimal burek = new Dog();
        LoudAnimal mruczek = new Cat();

        System.out.println("Pojedyncze zwierzęta");
        burek.makeNoise();
        mruczek.makeNoise();


        System.out.println("\nLista zwierząt (Polimorfizm)");
        List<LoudAnimal> zwierzeta = new ArrayList<>();
        zwierzeta.add(new Dog());
        zwierzeta.add(new Cat());
        zwierzeta.add(new Dog());

        for (LoudAnimal zwierze : zwierzeta) {
            zwierze.makeNoise();
        }
    }
}