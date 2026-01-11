package zad3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Osoba> osoby = new ArrayList<>();

        osoby.add(new Osoba("Anka", 35, 1.80));
        osoby.add(new Osoba("Wiktor", 22, 1.65));
        osoby.add(new Osoba("Aurelia", 40, 1.75));
        osoby.add(new Osoba("Karol", 19, 1.70));
        osoby.add(new Osoba("Tomasz", 30, 1.85));

        System.out.println("Przed posortowaniem:");
        for (Osoba o : osoby) {
            System.out.println(o);
        }

        Collections.sort(osoby, new AgeComparator());

        System.out.println("\nPo posortowaniu (według wieku rosnąco):");
        for (Osoba o : osoby) {
            System.out.println(o);
        }
    }
}