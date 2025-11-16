package people;

public class Person {
    private String firstName;
    protected String lastName;

    public Person(String firstName, String lastName) {
        if (firstName == null || firstName.isEmpty()) this.firstName = "";
        else this.firstName = firstName;

        if (lastName == null || lastName.isEmpty()) this.lastName = "";
        else this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
