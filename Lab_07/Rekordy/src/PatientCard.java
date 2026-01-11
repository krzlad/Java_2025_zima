import java.util.ArrayList;

public class PatientCard {
    public ArrayList<String> medicalHistory;
    public ArrayList<String> allergies;
    public ArrayList<String> medications;

    public PatientCard(ArrayList<String> medicalHistory,
                       ArrayList<String> allergies,
                       ArrayList<String> medications) {

        this.medicalHistory = medicalHistory;
        this.allergies = allergies;
        this.medications = medications;
    }

    @Override
    public String toString() {
        return "Historia: " + medicalHistory +
                ", Alergie: " + allergies +
                ", Leki: " + medications;
    }
}
