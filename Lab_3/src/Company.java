public class Company {
    public static void main(String[] args){
        Employee emp = new Employee();
        emp.name = "Jan Kowalski";

        System.out.println("Pracownik: " + emp.name);
    }
}

class Employee{
    String name;
}
