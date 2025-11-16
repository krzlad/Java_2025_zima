package people;

public class Employee extends Person {

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void displayData() {
        System.out.println("Employee: " + getFirstName() + " " + getLastName());
    }
}
