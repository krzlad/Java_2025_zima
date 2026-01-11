import zad1.Box;
import zad2.Triple;
import zad3.ArrayUtils;
import zad4.ArraySwap;
import zad5.Animal;
import zad5.Dog;
import zad6.Pair;
import zad6.Tree;

public class Main {
    public static void main(String[] args) {

        // --- ZADANIE 1 (Box) ---
        System.out.println("\n===== ZADANIE 1 =====");
        Box<String> box = new Box<>();
        box.set("Jestem w pudełku");
        System.out.println("Zawartość: " + box.get());


        // --- ZADANIE 2 (Triple) ---
        System.out.println("\n===== ZADANIE 2 =====");
        Triple<String, Integer, Double> triple = new Triple<>("Jan", 25, 180.5);
        System.out.println("1: " + triple.getFirst());
        System.out.println("2: " + triple.getSecond());
        System.out.println("3: " + triple.getThird());


        // --- ZADANIE 3 (Max) ---
        System.out.println("\n===== ZADANIE 3 =====");
        Integer[] liczby = {1, 10, 5, 20, 3};
        System.out.println("Max z liczb: " + ArrayUtils.max(liczby));


        // --- ZADANIE 4 (Swap) ---
        System.out.println("\n===== ZADANIE 4 =====");
        String[] litery = {"A", "B", "C"};
        System.out.println("Przed: " + litery[0] + ", " + litery[2]);
        ArraySwap.swap(litery, 0, 2);
        System.out.println("Po: " + litery[0] + ", " + litery[2]);


        // --- ZADANIE 5 (Animal FindMax) ---
        System.out.println("\n===== ZADANIE 5 =====");
        Dog pies1 = new Dog("Azor", 4);
        Dog pies2 = new Dog("Reksio", 7);
        Dog starszy = Animal.findMax(pies1, pies2);
        System.out.println("Starszy pies: " + starszy.name);


        // --- ZADANIE 6 (Tree MinMax) ---
        System.out.println("\n===== ZADANIE 6 =====");
        Tree[] las = {
                new Tree("Brzoza", 10),
                new Tree("Dąb", 25),
                new Tree("Sosna", 15)
        };
        Pair<Tree> wynik = new Pair<>(null, null);
        Tree.findMinMaxHeight(las, wynik);

        System.out.println("Najniższe: " + wynik.getFirst());
        System.out.println("Najwyższe: " + wynik.getSecond());
    }
}