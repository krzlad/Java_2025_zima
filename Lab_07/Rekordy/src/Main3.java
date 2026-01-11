import java.time.LocalDate;
import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {

        ArrayList<String> hist = new ArrayList<>();
        hist.add("Operacja wyrostka");

        ArrayList<String> al = new ArrayList<>();
        al.add("Pyłki");

        ArrayList<String> meds = new ArrayList<>();
        meds.add("Ibuprofen");

        Patient p1 = new Patient(
                "Kacper",
                "Nowak",
                LocalDate.of(2000, 3, 10),
                hist, al, meds
        );

        Patient p2 = new Patient(
                "Jan",
                "Kowalski",
                LocalDate.of(1995, 10, 2),
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>()
        );

        Doctor d = new Doctor("Jan", "Kowalski", "Chirurg");
        d.addPatient(p1);
        d.addPatient(p2);

        System.out.println(d);
        System.out.println(p1.card);
    }
}
