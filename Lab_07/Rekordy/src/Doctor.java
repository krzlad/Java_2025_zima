import java.util.ArrayList;

public class Doctor {
    public String firstName;
    public String lastName;
    public String specialization;
    public ArrayList<Patient> patients; // AGREGACJA

    public Doctor(String firstName, String lastName, String specialization) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    public void addPatient(Patient p) {
        patients.add(p);
    }

    @Override
    public String toString() {
        return "Dr " + firstName + " " + lastName +
                " [" + specialization + "] Pacjenci: " + patients;
    }
}
