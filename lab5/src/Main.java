package testapp;

import people.Employee;

public class Main {
    public static void main(String[] args) {

        Employee e = new Employee("Kacper", "Nowak");
        e.displayData();


        System.out.println(e.getLastName());
    }
}
