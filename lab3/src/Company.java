class Employee {
    String name;
}

public class Company {
    public static void main(String[] args){
        Employee emp = new Employee();
        emp.name = "Wiktor";

        System.out.println("Pracownik " + emp.name);
    }
}


