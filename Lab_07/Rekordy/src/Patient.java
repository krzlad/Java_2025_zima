import java.time.LocalDate;
import java.util.ArrayList;

public class Patient {
    public String firstName;
    public String lastName;
    public LocalDate birthDate;
    public PatientCard card;

    public Patient(String firstName, String lastName, LocalDate birthDate,
                   ArrayList<String> history,
                   ArrayList<String> allergies,
                   ArrayList<String> medications) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;

        this.card = new PatientCard(history, allergies, medications);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + birthDate + ")";
    }
}
